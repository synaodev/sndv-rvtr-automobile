package com.synaodev.automobile.car;

public class Wheels extends CarPart {
	private String brand;
	public Wheels() {
		super();
		brand = "Firestone";
	}
	public Wheels(int condition, String brand) {
		super();
		this.setCondition(condition);
		this.brand = brand;
	}
	@Override
	public void function() {
		System.out.print("Wheels from ");
		System.out.print(brand);
		System.out.print("; ");
	}
}
