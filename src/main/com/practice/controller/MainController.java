/**
 * 
 */
package com.practice.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vvukoti
 *
 */
@RestController
@EnableAutoConfiguration
public class MainController {
	
	 @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	    	SpringApplication app=new SpringApplication(MainController.class);
	    	
	        SpringApplication.run(MainController.class, args);
	    }

}
