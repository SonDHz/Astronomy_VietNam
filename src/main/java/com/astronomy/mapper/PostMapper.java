package com.astronomy.mapper;

import org.springframework.stereotype.Component;

import com.astronomy.dto.PostCreateModifyDTO;
import com.astronomy.entity.CategoryEntity;
import com.astronomy.entity.PostEntity;

@Component
public class PostMapper {

	public PostEntity toPost(PostCreateModifyDTO dto) {
		
		CategoryEntity categoryEntity = CategoryEntity.builder()
				.id(dto.getCategory())
				.build();
		return PostEntity.builder()
				.id(dto.getId())
				.title(dto.getTitle())
				.shortDescription(dto.getShortDescription())
				.content(dto.getContent())
				.thumbnail(dto.getThumbnail())
				.createdBy(dto.getCreatedBy())
				.modifiedBy(dto.getModifiedBy())
				.category(categoryEntity)
				.build();
	}

	public PostCreateModifyDTO toPostCreateModifyDTO(PostEntity post) {
		return PostCreateModifyDTO.builder()
				.id(post.getId())
				.title(post.getTitle())
				.shortDescription(post.getShortDescription())
				.content(post.getContent())
				.thumbnail(post.getThumbnail())
				.createdBy(post.getCreatedBy())
				.modifiedBy(post.getModifiedBy())
				.category(post.getCategory().getId())
				.build();
	}

}
