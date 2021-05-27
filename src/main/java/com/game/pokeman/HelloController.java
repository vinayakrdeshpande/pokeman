package com.game.pokeman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/HELLO")
	public String index() {
		return "Hello trainner";
	}

}
