package com.synaodev.automobile.car;

public class FuelTank extends CarPart {
	private int amount;
	public FuelTank() {
		super();
		amount = 1000;
	}
	public FuelTank(int condition, int amount) {
		super();
		this.setCondition(condition);
		this.amount = amount;
	}
	@Override
	public void function() {
		System.out.print("Fuel Tank at ");
		System.out.print(amount);
		System.out.print(" milliliters; ");
	}
}
