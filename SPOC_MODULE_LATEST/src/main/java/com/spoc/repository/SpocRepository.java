package com.spoc.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spoc.entity.Training_Request;

public interface SpocRepository extends CrudRepository<Training_Request,Integer>{

	
	
}

