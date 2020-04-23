package com.spoc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spoc.service.SpocService;

@Controller
public class SpocController {
	@Autowired
	private SpocService spocService;
	@RequestMapping("/")
	public String home() 
	{
		return "welcomepage";
	}
	/*
	 * @RequestMapping("/status") public String getStatus() {
	 * spocService.getStatus(); return "welcomepage"; }
	 */
	@RequestMapping("/show")
	public String showAllList(HttpServletRequest request) 
	{
		request.setAttribute("request",spocService.showAllList());
		
		return "welcomepage";
	}
		
}

/*
 * req.setAttribute("requests",spocService.findAllRequests()); return "index";
 */