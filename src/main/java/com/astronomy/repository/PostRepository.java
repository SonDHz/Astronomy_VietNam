package com.astronomy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astronomy.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

	@Query(value = "SELECT * FROM post", nativeQuery = true)
	public List<PostEntity> getAll();
	
}
