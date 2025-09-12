package extProject.cls;

public class Student {

	public String name;
	public int age;
	private String studentId;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String studentId) {
		this.name=name;
		this.age=age;
		this.studentId = studentId;
	}
	public Student(String name, String studentId) {
		this.name=name;
		this.studentId = studentId;
	}
	public void study() {
		System.out.println(this.studentId+"가 공부를 합니다.");
		
	}
	public void introduce() {
		System.out.println(this.name+"가 자기소개를 합니다.");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	
	
}
