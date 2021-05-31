package com.game.pokeman;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Traineer {

	private @Id @GeneratedValue(strategy = GenerationType.AUTO) long id;
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Pokeman> pokemanLst = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pokeman> getPokemanLst() {
		return pokemanLst;
	}

	public void setPokemanLst(List<Pokeman> pokemanLst) {
		this.pokemanLst = pokemanLst;
	}
    
    
}
