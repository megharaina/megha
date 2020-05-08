package com.testintegration.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.testintegration.model.IncomingRequests;
@Repository
public interface IncomingRequestsDao extends CrudRepository<IncomingRequests, Integer>{
	
		@Query(value="SELECT * FROM incoming_requests WHERE request_status = 0",nativeQuery = true)
		public List<IncomingRequests> findAllRequests(int i);
}
