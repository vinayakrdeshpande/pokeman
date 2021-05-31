package com.game.pokeman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="POKEMAN")
public class Pokeman {
  
	 @Id  @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String name;
	 private String type;
	 private Integer speed;
	 private Integer attack;
	 private Integer hp;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
}