package com.synaodev.automobile;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<CarPart> parts;
	public Car() {
		parts = new ArrayList<CarPart>();
	}
	public void run() {
		for (CarPart p : parts) {
			p.status();
		}
	}
}
