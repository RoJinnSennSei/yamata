package com.yamata.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/d")
public class A {
	@RequestMapping("/bb")
	public String b(){
		System.out.println("bbbbbbbbbb");
		return "b";
	}
}
