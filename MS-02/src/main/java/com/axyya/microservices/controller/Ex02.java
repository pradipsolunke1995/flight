package com.axyya.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axyya.microservices.microservice.Calling;

@RestController
public class Ex02 {
	@Value("${message}")
	private String msg;
	
	@Autowired
	Calling call;
	
	@RequestMapping("/method")
	public String getMsg() {
		
		return msg;
	}

	@GetMapping(value = "/endPoint2")
	public String endPoint1() {
		return "from ms01";
	}
	  @GetMapping("/ep1")
	    public  String getDataFromMS02(){
	        return call.getMsgFromMs01();
	    }
}
