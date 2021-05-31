package com.game.pokeman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemanController {

	private PokemanRepository pokemanRepository;

	public PokemanController(PokemanRepository pokemanRepository) {
		this.pokemanRepository = pokemanRepository;
	}
	
	@GetMapping("/all")
	public Iterable<Pokeman> getAll(){
		return pokemanRepository.findAll();
	}

}
