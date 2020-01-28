package com.kiran;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test1 {

	public String getProd() {
		System.out.println("getting prod");
		return "prod";
	}
}
