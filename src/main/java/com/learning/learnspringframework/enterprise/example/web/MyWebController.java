package com.learning.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebController {
	
	
	private BusinessService businessService;
	
	@Autowired
	public MyWebController(BusinessService businessService) {
		super();
		System.out.println("Injection by constructor class");
		this.businessService = businessService;
	}


	public long returnValueFromBusinessService() {
		long sum = businessService.calculateSum();
		return sum;
	}
}


