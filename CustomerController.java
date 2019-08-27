package com.example.demo2.app.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo2.app.service.CustomerService;;

@SuppressWarnings("unused")
@Controller
@RequestMapping("/web")
public class CustomerController {
	@Autowired CustomerService customerService;
	
	
	@RequestMapping(value = "/new" , method = RequestMethod.POST)
	public ResponseEntity<?> CreateNewCustomer(){
		
		
		try {
			return new ResponseEntity<>("1",HttpStatus.OK);
		
		}
		catch(Exception e){
			if(e instanceof Exception){
				return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_IMPLEMENTED);
			}
			else {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}
}
