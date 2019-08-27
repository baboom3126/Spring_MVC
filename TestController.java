package com.example.demo2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	
	@RequestMapping(value="/hello")
	public ModelAndView hello() {
		return new ModelAndView("helloworld");
	}
	
	@RequestMapping(value="/test")
	public String test() {
		return "test";
	}
}
