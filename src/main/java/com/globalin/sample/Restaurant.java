package com.globalin.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	@Autowired
	private Chef chef;

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	@Override
	public String toString() {
		return "Restaurant [chef=" + chef + "]";
	}
}
