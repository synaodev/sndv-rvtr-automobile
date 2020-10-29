package com.synaodev.automobile.car;

public class Seats extends CarPart {
	private int count;
	public Seats() {
		super();
		count = 4;
	}
	public Seats(int condition, int count) {
		super();
		this.setCondition(condition);
		this.count = count;
	}
	@Override
	public void function() {
		System.out.print(count);
		System.out.print(" seats total; ");
	}
}
