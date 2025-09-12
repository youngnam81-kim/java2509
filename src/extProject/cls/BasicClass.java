package extProject.cls;

public class BasicClass {

	public static void main(String[] args) {
		// 오브젝트 생성.
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.name="김철수";
		st1.age=20;
		st1.setStudentId("20250902");
		
		st2.name="이영희";
		st2.age=24;
		st2.setStudentId("20250901");
		
		st1.introduce();
		st1.study();
		
		st2.introduce();
		st2.study();
		
		System.out.println("================================");
		
		Student stInit1 = new Student("김철수",20,"20250922");
		Student stInit2 = new Student("이영희","20250911");
		
		stInit1.introduce();
		stInit1.study();
		System.out.println(stInit1.toString());
		
		stInit2.introduce();
		stInit2.study();
		System.out.println(stInit2.toString());
		
		
	}

}
