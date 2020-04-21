package com.spoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpocController {
	
	@RequestMapping("/")
	public String home() {
		
		return "homepage1";
	}
}