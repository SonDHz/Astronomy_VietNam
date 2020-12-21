package com.astronomy.repository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

	@Query(value = "SELECT * FROM post", nativeQuery = true)
	public List<PostEntity> getAll();
	
	@Query(value = "select * from post ORDER BY id desc", nativeQuery = true)
	public List<PostEntity> getAllIdDesc();
	
	@Query(value = "select * from post ORDER BY rand() limit 3", nativeQuery = true)
	public List<PostEntity> getAllRamdom();
	
	@Query(value = "select count(*) from post;", nativeQuery = true)
	public int countPost();
}
