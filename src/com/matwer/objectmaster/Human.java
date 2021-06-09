package com.matwer.objectmaster;

/**
 * @author Matthew Werner
 *
 */

public class Human {
	
	public int strength, stealth, intelligence, health;
	
	public Human() {
		strength = 3;
		stealth = 3;
		intelligence = 3;
		health = 100;
	}
	
	public void attack(Human h) {
		h.health -= this.strength;
		System.out.println("Human attacks - health is " + h.health);
	}

}
