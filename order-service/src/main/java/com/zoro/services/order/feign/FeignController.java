package com.zoro.services.order.feign;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class FeignController {
	@Resource
	FeignClientInterface dateServiceFeignClientInterface;

	@RequestMapping(value = "/getGreetingsFromAccoount", method = RequestMethod.GET)
	public String getDate(@RequestParam
	String name) {
		return dateServiceFeignClientInterface.consumer(name);
	}
}