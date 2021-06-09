package com.matwer.objectmaster;

/**
 * @author Matthew Werner
 *
 */
public class Samurai extends Human {

	/**
	 * 
	 */
	public Samurai() {
		// override health
		this.health = 200;
	}
	
	public void deathBlow(Human h) {
		h.health = 0;
		this.health = health/2;
		System.out.println("Samurai deals a killing blow. Samurai's health is " + health);
	}
	
	public void meditate() {
		this.health *= 1.5;
		System.out.println("Samurai mediates - health is " + health);
	}
	
	

}
