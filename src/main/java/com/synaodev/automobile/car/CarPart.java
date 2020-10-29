package com.synaodev.automobile.car;

public abstract class CarPart {
	private int condition;
	public CarPart() {
		this.condition = 0;
	}
	protected int getCondition() {
		return condition;
	}
	protected void setCondition(int condition) {
		this.condition = condition;
	}
	public void status() {
		this.function();
		System.out.print("Condition: ");
		System.out.print(condition);
		System.out.println("/100");
	}
	public abstract void function();
}
