package com.marlabs.democloudfoudry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleTestRestController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello World v2";
	}

}
