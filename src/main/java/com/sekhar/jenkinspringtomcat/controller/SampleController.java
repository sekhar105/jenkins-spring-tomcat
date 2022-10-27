package com.sekhar.jenkinspringtomcat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SampleController {

	
//	@GetMapping("/add")
//	public String welcome() {
//		return "welcome";
//	}
	
	@RequestMapping("/")
	public String wel() {
		return "welcome";
	}
}
