package ex.st;

public class Student7 {
	// 중요한 개인 정보 : 값이 클래스 밖으로부터 보호.
	private String name;
	private String studentId;
	public int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String toString() {
		return "Student7 "+name+","+age+","+studentId;
	}
	
}
