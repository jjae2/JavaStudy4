package com.prac.s3.member;

public class Member {

	private String name;
	private String email;
	private double weight;
	private double height;
	private int age;
	// private이 설정되서 setter 메서드를통해 값을 넣을수있다.
	// setter getter set변수명,get변수명
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
