package com.prac.s6.student;

public class StudentSecondService extends StudentService{
	
	@Override
	public StudentDTO setStudent() {
		// StudentDTOSecond 입력하느 코드 생성
		StudentDTOSecond studentDTOsecond = new StudentDTOSecond();
		return studentDTOsecond;
	}
}

