package ex.st;

public class Student1 {
	String name;
	String gender;
	int age;
	int grade;

	public Student1() { // 생성자
		name = "철수";
		gender = "M";
		age = 17;
		grade = 2;
	}

	public Student1(String name, int age) { // 생성자
		this.name = name;
		this.gender = "M";
		this.age = age;
		this.age = 2;
	}
}
