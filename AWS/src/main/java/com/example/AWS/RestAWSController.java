package com.example.AWS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAWSController {

	@GetMapping("/aws")
	public String display() {
		return "AWS_Example";
	}

}
