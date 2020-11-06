package com.astronomy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astronomy.entity.ManufacturerEntity;

public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity, Long> {

}
