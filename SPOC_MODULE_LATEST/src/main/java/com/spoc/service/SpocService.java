package com.spoc.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoc.entity.Training_Request;
import com.spoc.repository.SpocRepository;


@Service
@Transactional
public class SpocService 
{
	/*
	 * @Autowired private EntityManager entityManager;
	 * 
	 * public String getStatus() { return "HI"; }
	 */
	@Autowired
	private final SpocRepository spocRepository;
	
	
	public SpocService(SpocRepository spocRepository) {
		super();
		this.spocRepository = spocRepository;
	}

	/*
	 * public Collection<Training_Request> findAllRequests(){ List<Training_Request>
	 * requests = new ArrayList<>(); Iterable<Training_Request> requestList =
	 * spocRepository.findAll(); requestList.forEach(requests::add); return
	 * requests; }
	 */
	
	
		public List<Training_Request> showAllList() {
			List<Training_Request> list = new ArrayList<Training_Request>();
			list = spocRepository.findByRequestId(101);
			System.out.println(list);
			return spocRepository.findByRequestId(101);
		}
	 
   
}
