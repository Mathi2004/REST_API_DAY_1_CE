package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_3 {
  @Value("${var1}")
  private String yourFavColor;
  @GetMapping("/yourFavColor")
  public String getMyFav()
  {
	  return "My favorite color is "+yourFavColor;
  }
  
}
