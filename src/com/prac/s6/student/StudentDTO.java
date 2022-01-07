package com.prac.s6.student;

public class StudentDTO {
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
public  int setTotal() {
	total=kor+eng+math;
	return 0;
}

}
