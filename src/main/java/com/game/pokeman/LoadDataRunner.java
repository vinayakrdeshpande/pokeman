package com.game.pokeman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadDataRunner implements ApplicationRunner {

	@Autowired
	private TraineerRepository trainerRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Traineer ash = new Traineer();
		ash.setName("Ash");

		Pokeman pikachu = new Pokeman();
		pikachu.setName("Pikachu");
		pikachu.setAttack(10);
		pikachu.setHp(10);
		pikachu.setSpeed(9);
		pikachu.setType("Electric");

		Pokeman squirtle = new Pokeman();
		squirtle.setName("Squirtle");
		squirtle.setAttack(8);
		squirtle.setHp(10);
		squirtle.setSpeed(8);
		squirtle.setType("Water");

		ash.getPokemanLst().add(pikachu);
		ash.getPokemanLst().add(squirtle);

		Traineer misty = new Traineer();
		misty.setName("Misty");

		Pokeman charmander = new Pokeman();
		charmander.setName("Charmander");
		charmander.setAttack(9);
		charmander.setHp(10);
		charmander.setSpeed(7);
		charmander.setType("Fire");

		misty.getPokemanLst().add(charmander);

		trainerRepository.save(ash);
		trainerRepository.save(misty);

	}

}
