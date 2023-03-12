package com.shanhy.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${server.name}")
    private String name;
	@GetMapping
	public String show() {
		return "OK888" + name;
	}
}
