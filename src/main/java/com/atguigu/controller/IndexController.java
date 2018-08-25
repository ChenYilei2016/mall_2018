package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/goto_attr")
	public String goto_attr() {
		return "attr";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "main";
	}
	
	@RequestMapping("/goto_spu")
	public String goto_spu() {
		return "spu";
	}
	
}
