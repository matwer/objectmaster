package com.matwer.objectmaster;

public class Human {
	
	public int strength, stealth, intelligence, health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public int attack(Human h) {
		h.health -= this.strength;
		return h.health;
	}

}
