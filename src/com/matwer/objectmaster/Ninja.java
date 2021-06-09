package com.matwer.objectmaster;

/**
 * @author Matthew Werner
 *
 */
public class Ninja extends Human {

	/**
	 * 
	 */
	public Ninja() {
		// override stealth
		this.stealth = 10;
	}
	
	public void steal(Human h) {
		h.health -= this.stealth;
		this.health += 10;
		System.out.println("Ninja steals health - human health is " + h.health + ", ninja's health is " + this.health);
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("Ninja runs away - health is " + this.health);
	}
	
	
}