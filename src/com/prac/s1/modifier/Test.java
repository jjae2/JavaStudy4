package com.prac.s1.modifier;

class Test {
	//default접근지정자는 생략한다
	//int num;//int는 default를 사용했기때문에 같은패키지에서 사용했다
	
	private int num;
	public Test() {
		
	}
	public void info(int num) {
		this.num=num;
		System.out.println(this.num);
	}
}
