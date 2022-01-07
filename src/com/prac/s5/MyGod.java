package com.prac.s5;

public class MyGod {
	private static MyGod mygod;
	private MyGod() {
	}
	public static MyGod makeGod() {
		
		if(mygod==null) {
			mygod= new MyGod();
		}
		return mygod;
	}
}
