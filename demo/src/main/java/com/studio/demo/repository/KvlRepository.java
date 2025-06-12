package com.studio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studio.demo.model.KvlModel;
import java.util.List;


public interface KvlRepository extends JpaRepository<KvlModel, Long> {
	boolean existsByEmail(String email);
	KvlModel  findByEmail(String email);
}
