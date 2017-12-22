package com.neo.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Value("${application.message:Hello World}")
    private String message = "Hello World";
	
	@RequestMapping("/hello")
	public String hello(ModelMap model) {
		model.put("time", new Date());
        model.put("message", this.message);
		return "hello";
	}
}
