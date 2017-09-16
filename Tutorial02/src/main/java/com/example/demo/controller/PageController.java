package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class PageController{
	
	@RequestMapping("/hello")
	public String index (){
		return "hello";
	}
	
	@RequestMapping("/greeting")
	public String greeting (@RequestParam(value = "name") String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
	}
	@RequestMapping("/perkalian")
	public String greeting (@RequestParam(value = "a", required = false, defaultValue = "0") int a,
			@RequestParam(value = "b", required = false, defaultValue = "0") int b, Model model){
		
		int c = a * b;
		model.addAttribute("a", a);
		model.addAttribute("b", b);
		model.addAttribute("c", c);
		return "operasi";
	}
}