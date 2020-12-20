package com.astronomy.Service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.astronomy.constant.SystemConstant;
import com.astronomy.dto.MyUser;
import com.astronomy.entity.RoleEntity;
import com.astronomy.entity.UserEntity;
import com.astronomy.repository.UserRepository;

@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = repo.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_STATUS);
		if(userEntity == null) {
			throw new UsernameNotFoundException("user not found");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		for (RoleEntity role : userEntity.getRoles()) {
			authorities.add(new SimpleGrantedAuthority(role.getCode()));
		}
		
		//put thông tin của user vào security để duy trì khi login
		MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(),//
				true, true, true, true, authorities);
		myUser.setFullName(userEntity.getFullName());
		myUser.setAddress(userEntity.getAddress());
		myUser.setEmail(userEntity.getEmail());
		return myUser;
	}
}