package ex.st;

public class Student6 {
	String name;
	int age=20;
	char grade;
	String studentId;

	// 기본 생성자 커스터마이징
	public Student6() {
		System.out.println( + this.age + "세 " + "기본 학생이 생성 되었습니다.");
	}

	// 매개변수 생성자(매개변수 필수 일때 사용)
	public Student6(String aName, String aStudentId) {
		name = aName;
		studentId = aStudentId;

		System.out.println("id가 " + studentId + " " + this.age + "세 " + name + "학생이 생성되었습니다.");
		System.out.println("id가 " + this.studentId + " " + this.name + "학생이 생성되었습니다.");
	}

	// 모든 필드를 적용해줌.
	public Student6(String name, int age, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.age = age;

		System.out.println("id가 " + this.studentId + " " + this.age + "세 " + this.name + "학생이 생성되었습니다.");
		System.out.println("id가 " + studentId + " " + age + "세 " + name + "학생이 생성되었습니다.");
	}
	
	//method
	public void study() {
		System.out.println(this.name+"학생이 공부를 합니다.");
	}

	public void intruduce() {
		System.out.println(this.name+"학생이 소개를 합니다.");
	}
	
	
	

}
