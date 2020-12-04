package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	UserEntity findOneByUsernameAndStatus(String username, int status );
	
	UserEntity findByUsername(String username);
	
	@Query(value = "select u.* from user u left join user_role ul on u.id = ul.userid where roleid = 1", nativeQuery = true)
	public List<UserEntity> getAllUser(); // Admin
	
	@Query(value = "select u.* from user u left join user_role ul on u.id = ul.userid where roleid = 2", nativeQuery = true)
	public List<UserEntity> getAllCustomer(); //
}
