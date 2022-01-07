package com.prac.s8.rpg;

public class Knight extends Character implements Act{
	@Override
	public void attack() {
		System.out.println("칼 휘두르기");
		
	}

	@Override
	public void move() {
		System.out.println("걷기");
		
	}

	public void slash() {
		System.out.println("칼 휘두르기");
	}
}
