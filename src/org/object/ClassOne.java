package org.object;

public class ClassOne extends AbstractClassOne {
	
	public void ashokLeylandRevenue(int revenue) {
		System.out.println("AshokLeyland Total revenue is " + revenue);
	}

	@Override
	public void ashokLeylandworldwide(boolean mnc) {
		System.out.println("Ashokleyland is MNC company? " + mnc);
	}

	@Override
	public void ashokleylandEngineMake(String make) {
		System.out.println("Ashokleyland Engine Maker is " + make);
	}

	@Override
	public void ashokLeylandVehicles(String vehicles) {
		System.out.println("Which vehicles are manufacturing in ashok leyland? " + vehicles);
	}

	@Override
	public void ashokLeylandGroup(String group) {
		System.out.println("Which group in ashok leyland? " + group);
	}
	

}
