package com.inetsoft.factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.println("prepare..." + name);
		System.out.println("Tossing dough...");
		System.out.println("Add sauce...");
		String tops = toppings.stream()
				.collect(Collectors.joining(", "));
		System.out.println("Add toppings..." + tops);
	}

	public void bake() {
		System.out.println("Pizza bake...");
	}

	public void cut() {
		System.out.println("Pizza cut...");
	}

	public void box() {
		System.out.println("Pizza box...");
	}
	
	public String getName() {
		return name;
	}

}
