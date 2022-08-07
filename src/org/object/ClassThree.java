package org.object;

public class ClassThree extends ClassTwo   {
	
	public void ashokLeylandHeadQuaters(String location) {
		System.out.println("Ashok Leyland Manufacturing location is " + location);
	}
	
	public static void main(String[] args) {
		ClassThree c = new ClassThree();
		c.ashokleylandEngineMake("Hino");
		c.ashokLeylandGroup("Hinduja Group");
		c.ashokLeylandHeadQuaters("chennai");
		c.ashokLeylandLogo('L');
		c.ashokLeylandRevenue(5656);
		c.ashokLeylandVehicles("Commercial Vehicles");
		c.ashokLeylandworldwide(true); 
	}
}