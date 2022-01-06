package com.prac.s4;

public class Square {
	public static int sero;
	final int GARO_SIZE;
	
	public Square() {
		this.GARO_SIZE=5;
	}
	
	static {
		Square.sero=3;
	}
	public static void info() {
		System.out.println("클래스 메서드");
//		System.out.println(this.garo);
		System.out.println(Square.sero);
//		this.info2();
	}
	public void info2() {
		System.out.println("인스턴스 메서드");
		System.out.println(GARO_SIZE);
		System.out.println(Square.sero);
		Square.info();
	}
}
