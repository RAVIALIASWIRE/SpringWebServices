package com.tm.webservices.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.webservices.domain.Message;
import com.tm.webservices.services.App;

@RestController
public class SpringWsRestController {
	@RequestMapping("/creditscore/{numberone}/{numbertwo}")
    public Message message(@PathVariable int numberone,@PathVariable int numbertwo) {
		System.out.println("Received numbers are "+numberone+" and "+numbertwo); 
        Message msg = new Message("Result : ", App.getCreditScore(numberone, numbertwo));
        return msg;
    }
}
