package com.matwer.objectmaster;

/**
 * @author Matthew Werner
 *
 */

public class HumanTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Human derrek = new Human();
		Human tomke = new Human();
		Human guifford = new Human();
		Wizard jairo = new Wizard();
		Ninja hollis = new Ninja();
		Samurai mol = new Samurai();
		
		System.out.println("Derrak attacks Tomke...");
		derrek.attack(tomke);
		
		System.out.println("Guifford attacks Tomke...");
		guifford.attack(tomke);
		
		System.out.println("Tomke attacks Guifford...");
		tomke.attack(guifford);
		System.out.println("Tomke attacks Guifford...");
		tomke.attack(guifford);
		System.out.println("Tomke attacks Guifford...");
		tomke.attack(guifford);
		System.out.println("Tomke attacks Guifford...");
		tomke.attack(guifford);
		
		System.out.println("Jairo heals Guifford...");
		jairo.heal(guifford);
		System.out.println("Jairo attacks Derrek...");
		jairo.fireball(derrek);
		
		System.out.println("Hollis attacks Jairo...");
		hollis.steal(jairo);
		System.out.println("Hollis runs away...");
		hollis.runAway();
		
		System.out.println("Mol attacks Hollis...");
		mol.deathBlow(hollis);
		System.out.println("Mol meditates...");
		mol.meditate();
	}
}
