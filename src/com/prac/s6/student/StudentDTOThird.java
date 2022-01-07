package com.prac.s6.student;

public class StudentDTOThird extends StudentDTO {

	int physics;
	public int setTotal() {
		this.total=this.kor+this.eng+this.math+this.physics;
		System.out.println(this.total);
		return this.total;
	}
}
