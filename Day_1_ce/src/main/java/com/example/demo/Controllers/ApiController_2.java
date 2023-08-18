package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_2 {
            @Value("${var}")
            private String studentName;
            @GetMapping("/name")
            public String getName()
            {
            	return "Welcome " + studentName + " !";
            }
}
