package com.zoro.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServiceController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(@RequestParam
	String param) {
		return "hello " + param;
	}
}
