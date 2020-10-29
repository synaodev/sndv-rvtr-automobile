package com.synaodev.automobile;

public abstract class CarPart {
	private int condition;
	protected int getCondition() {
		return condition;
	}
	protected void setCondition(int condition) {
		this.condition = condition;
	}
	public abstract void status();
	public CarPart() {
		this.condition = 100;
	}
	public CarPart(int condition) {
		this.condition = condition;
	}
}
