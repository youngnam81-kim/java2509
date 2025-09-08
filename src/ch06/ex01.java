package ch06;

public class ex01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldArr = {"java","array","copy"};
		String[] newArr = new String[5];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
//		for(int i=0 ; i<newArr.length ;i++) {
//			System.out.println(newArr[i]);
//		}
		
		for(String newA : newArr) {
			System.out.print(newA+ " ,");
		}
		System.out.println("");
		
		int[] scores = {1,9,8,8,7};
		for( int score : scores) {
			System.out.print(score+", ");
		}System.out.println("");
		
		int[] copyArr = new int[7];	
		System.arraycopy(scores, 0, copyArr, 0, scores.length);		
		
		for( int copyA : copyArr) {
			System.out.print(copyA+", ");
		}System.out.println("");
		
		System.out.println(args.length); 
		for( String arg : args) {
			System.out.println(arg);
		}System.out.println("");
		
		Student student = new Student();
		
		System.out.println(student.name);
		
		student.name="영희";
		
		System.out.println("수정된 이름 : "+student.name);
		System.out.println(student.age);
		System.out.println(student.grade);
		System.out.println(student.gender);
		
		Student student2 = new Student("김영남", 45);
		System.out.println("초기화 이름 : "+student2.name);
		System.out.println("초기화 나이 : "+student2.age);
		System.out.println(student2.grade);
		System.out.println(student2.gender);
	}

}
