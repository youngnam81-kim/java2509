package ch06;

public class Student {
	String name;
	String gender;
	int age;
	int grade;

	public Student() { // 초기화
		name = "철수";
		gender = "M";
		age = 17;
		grade = 2;
	}

	public Student(String name, int age) { // 초기화
		this.name = name;
		this.gender = "M";
		this.age = age;
		this.age = 2;
	}
}
