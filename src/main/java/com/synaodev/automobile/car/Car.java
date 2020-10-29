package com.synaodev.automobile.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<CarPart> parts;
	public Car() {
		parts = new ArrayList<CarPart>();
		parts.add(new Engine(40, 8));
		parts.add(new FuelTank(60, 590));
		parts.add(new Seats(50, 6));
		parts.add(new Wheels(70, "Michelin"));
		parts.add(new Windows(80, true));
	}
	public void run() {
		for (CarPart p : parts) {
			p.status();
		}
	}
}
