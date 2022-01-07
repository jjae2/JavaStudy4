package com.prac.s8.rpg;

public class Magician extends Character implements Act{
	private void spel() {
		System.out.println("마법 공격");
	}

	@Override
	public void attack() {
		this.spel();
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
