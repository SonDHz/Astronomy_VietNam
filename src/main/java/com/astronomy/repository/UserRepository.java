package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	UserEntity findOneByUsernameAndStatus(String username, int status);

	UserEntity findByUsername(String username);

	@Query(value = "select u.* from user_role ul left join user u on  ul.userid = u.id  \n"
			+ "inner join role rl on ul.roleid = rl.id where code = \"USER\";", nativeQuery = true)
	public List<UserEntity> getAllCustomer(); //
}
