package com.prac.s1.modifier;

import com.prac.s2.Test2;

public class ModifierMain {

	public static void main(String[] args) {
		Test test = new Test();
		int n =10;
		test.info(n);
		Test2 test2 = new Test2(); // 다른 패키지 클래스 쓰려면 임포트 해야함 ctrl+space bar로 자동임포트
	
	}

}
