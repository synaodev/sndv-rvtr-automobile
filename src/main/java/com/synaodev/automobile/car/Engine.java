package com.synaodev.automobile.car;

public class Engine extends CarPart {
	private int cylinders;
	public Engine() {
		super();
		cylinders = 4;
	}
	public Engine(int condition, int cylinders) {
		super();
		this.setCondition(condition);
		this.cylinders = cylinders;
	}
	@Override
	public void function() {
		System.out.print("Engine with ");
		System.out.print(cylinders);
		System.out.print(" cylinders; ");
	}
}
