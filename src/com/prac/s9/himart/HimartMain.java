package com.prac.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		Computer cp= new Computer();
		Phone ph = new Phone();
		Tv tv = new Tv();
		
		cp.brand="갤럭시";
		cp.company="삼성";
		cp.point=100;
		cp.price=1000;
		cp.cpu="i5";
		ph.brand="애플";
		ph.company="아이폰12";
		ph.point=50;
		ph.price=50;
		tv.brand="lg";
		tv.company="올레드";
		tv.point=70;
		tv.price=900;
				
		Client iu = new Client();
		iu.money=1000;
		iu.point=100;
		iu.buy(tv);
		iu.buy(ph);
	

	}

}
