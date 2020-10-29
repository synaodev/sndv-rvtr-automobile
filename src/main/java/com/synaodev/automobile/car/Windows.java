package com.synaodev.automobile.car;

public class Windows extends CarPart {
	private boolean plexiglass;
	public Windows() {
		super();
		plexiglass = false;
	}
	public Windows(int condition, boolean plexiglass) {
		super();
		this.setCondition(condition);
		this.plexiglass = plexiglass;
	}
	@Override
	public void function() {
		System.out.print("Windows that are");
		if (!plexiglass) {
			System.out.print(" not");
		}
		System.out.print(" plexiglass; ");
	}
}
