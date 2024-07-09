package com.FrontArtemiz.Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Start {
	@GetMapping("/")
	String data() {		
		return "data";
	}
	
	@GetMapping("/dataPl4")
	String datePl4(){
		return "dataPl4";
	}

}
