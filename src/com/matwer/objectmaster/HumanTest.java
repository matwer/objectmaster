package com.matwer.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Human shadrach = new Human();
		Human meshach = new Human();
		Human abednego = new Human();
		
		System.out.println("shadrach attacks meshach - meshach's health is " + shadrach.attack(meshach));
		System.out.println("meshach attacks abednego - abednego's health is " + meshach.attack(abednego));
		System.out.println("abednego attacks shadrach - shadrach's health is " + abednego.attack(shadrach));
		System.out.println("abednego attacks shadrach - shadrach's health is " + abednego.attack(shadrach));
		System.out.println("abednego attacks shadrach - shadrach's health is " + abednego.attack(shadrach));
		System.out.println("meshach attacks abednego - abednego's health is " + meshach.attack(abednego));
		System.out.println("shadrach attacks meshach - meshach's health is " + shadrach.attack(meshach));
		System.out.println("shadrach attacks meshach - meshach's health is " + shadrach.attack(meshach));
		
	}

}
