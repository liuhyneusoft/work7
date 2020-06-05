package com.java.fullstack.work7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome")
public class WelController {
	@RequestMapping(value = "/", method = { RequestMethod.GET })
	public String detail(@RequestParam(required = false) String param)  {
		 
		return "ok";
	}
}
