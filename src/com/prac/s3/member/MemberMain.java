package com.prac.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(28);
		member.setHeight(180.5);
		member.setEmail("jae@gmail.com");
		System.out.println(member.getAge());
		System.out.println(member.getHeight());
		String email = member.getEmail();//
		System.out.println(email);		//이렇게도 표현가능
}
}