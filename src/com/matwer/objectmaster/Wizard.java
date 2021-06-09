package com.matwer.objectmaster;

/**
 * @author Matthew Werner
 *
 */
public class Wizard extends Human {

	/**
	 * 
	 */
	public Wizard() {
		// override intelligence & health
		this.intelligence = 8;
		this.health = 50;
	}
	
	public void heal(Human h) {
		h.health += this.intelligence;
		System.out.println("Wizard heals - health is " + h.health);
	}
	
	public void fireball(Human h) {
		h.health -= this.intelligence*3;
		System.out.println("Wizard attacks with fireball - health is " + h.health);
	}

}
