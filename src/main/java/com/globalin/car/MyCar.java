package com.globalin.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCar {
	@Autowired
	private Tire tire;

	private String name = "포르쉐";

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "MyCar [tire=" + tire + "]";
	}

}
