package com.coh.example;

import java.util.ArrayList;
import java.util.Random;

public class GreetingStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSalutation());
	}

	public static String getSalutation() {
		Random rn = new Random();
		int key = rn.nextInt(8);
		ArrayList<String> salutations = new ArrayList<String>();
		salutations.add("Hei");
		salutations.add("Moi");
		salutations.add("Skudaa");
		salutations.add("Hoi");
		salutations.add("Morjensta");
		salutations.add("Huomenta");
		salutations.add("Terve");
		salutations.add("Hejsan");
		return salutations.get(key);
	}
}
