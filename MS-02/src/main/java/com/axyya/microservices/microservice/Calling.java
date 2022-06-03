package com.axyya.microservices.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MS-01")
public interface Calling {
	@GetMapping(value = "/endPoint1")
	public String getMsgFromMs01();

}
