package test;

public class Test0908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("0. 김영남 start ================================================");
		System.out.println("");
		System.out.println("1. start ================================================");
		String name = "철수";
		int age = 16;
		Double keyCm = 180d; //180D or 180.5 
		boolean student = true;
		char grade = 'A';

		System.out.println(name + " / " + age + " / " + keyCm.intValue() + " / " + student + " / " + grade);
		System.out.println("1. end ================================================");

		System.out.println("2. start ================================================");

		int a = 10;
		int b = 3;

		System.out.println((a + b)); // => 13 덧셈
		System.out.println(a - b); // => 7 뺄셈
		System.out.println(a * b); // => 30 곱셈
		System.out.println(a / b); // => 3 나눗셈
		System.out.println(a % b); // => 1 나머지

		if (a < b) { // => false
			System.out.println(a < b ? true : false);
		} else {
			System.out.println(a < b ? true : false);
		}

		// 3항연산.
		System.out.println(a > b ? true : false); // => true
		System.out.println(a == b ? true : false); // => false

		if (a > b && a > 8) { // ==> 두 조건이 참일때.
			System.out.println("&& true");
		} else {
			System.out.println("&& false");
		}

		if (a > b || a < 8) { // ==> 둘중 하나가 참일때.
			System.out.println("|| true");
		} else {
			System.out.println("|| false");
		}

		System.out.println(!student); // ==> false 반전 true->false, false->true

		System.out.println("10 : a++ => " + a++); //다음증가
		System.out.println("11 : a => " + a);

		System.out.println("12 : ++a => " + ++a); //먼저증가
		System.out.println("12 : a => " + a);

		System.out.println("12 : a-- => " + a--); //다음감소
		System.out.println("11 : a => " + a);

		System.out.println("10 : a++ => " + --a); //먼저감소
		System.out.println("10 : a++ => " + a);

		System.out.println("2. end ================================================");
		System.out.println("3. start ================================================");
		
		int score = 85;

		if (score > 90) {
			System.out.println("A");
		} else if (score > 80) {
			System.out.println("B");
		} else if (score > 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

		// 3항연산.
		boolean gradeSuccess = (score > 90) ? true : false;
		System.out.println("90점 이상으로 합격했습니까? "+gradeSuccess);

		switch (score) {
		case 95: {
			System.out.println("A");
			break;
		}
		case 85: {
			System.out.println("B");
			break;
		}
		case 75: {
			System.out.println("C");
			break;
		}
		default:
			System.out.println("D");
			break;
		}

		System.out.println("3. end ================================================");
		System.out.println("4. start ================================================");
		
//		for (int i = 2; i <= 9; i++) { // 단
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " * " + j + " = " + i * j);
//			}
//		}
//		or		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
//				if (j == 9) {
//					System.out.println(j + "*" + i + "=" + j * i + "\t\t");
//				} else {
//					System.out.print(j + "*" + i + "=" + j * i + "\t\t");
//				}
				System.out.print(j + "*" + i + "=" + j * i + "\t\t"+ (j==9?"\n":""));
			}
		}
		System.out.println("4. end ================================================");
		System.out.println("");
		System.out.println("0. 김영남 end ================================================");
	}

}
