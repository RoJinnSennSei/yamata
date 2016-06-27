package com.yamata.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class C {
	@RequestMapping({"/","/login"})
	public String o(){
		System.out.println("dss");
		return "d";
	}
}
