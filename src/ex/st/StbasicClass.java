package ex.st;

public class StbasicClass {
	public StbasicClass () {
	System.out.println("ex1 =============================");
	Student1 st1 = new Student1(); // 객체생성
	String str = null;
	int num = 0;

	System.out.println(st1);
	System.out.println(str);
	System.out.println(num);

	System.out.println("ex2 =============================");
	Student2 st2 = new Student2();
	st2.name = "네임";
	System.out.println("ex3 메소드 출력 =============================");
	Student3 st3 = new Student3();
	st3.introduce();
	st3.study();
	System.out.println("학생은 챕터 "+st3.ch()+"장을 공부 하고 있습니다.");
	System.out.println("ex4 =============================");
	Student4 st4 = new Student4();
	System.out.println("ex5 =============================");
	Student5 st5;
	st5= new Student5("철수");
	System.out.println("ex6 =============================");
	Student6 st6_a = new Student6();
	Student6 st6_b = new Student6("이하빈","20250909");
	Student6 st6_c = new Student6("김영남",29,"20250910");
	
	st6_b.study();
	st6_c.study();
	st6_c.intruduce();
	st6_b.intruduce();
	
	System.out.println("ex7 getter setter=============================");
	
	Student7 st7 = new Student7();
	System.out.println(st7.toString());
	
	st7.setName("김가빈");
	st7.age = 26;
	st7.setStudentId("20257845");
	System.out.println(st7.toString());

	}
}
