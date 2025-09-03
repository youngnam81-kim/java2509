package day03_0903.ch03;

import java.util.stream.Stream;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		String name1 = "홍길동은 어디 살까요?";
		String name2 = new String("홍길동은 한국에 삼니다.");

		System.out.println(name2.replace("홍", "김"));
		
		System.out.println(name2.indexOf("한국")); //없으면 -1을 리턴함
		
		System.out.println(name2.contains("삼니다."));
		
		String[] name1split = name1.split(" ");
		for (int i=0 ; i< name1split.length ; i++) {
			System.out.print(name1split[i]+" / ");	
		}
		System.out.print("\n");
		
		String[] season4 = {"봄","여름","가을","겨울"};
		
		season4[2]="가을의 단풍";
		
		for (String season4data : season4 ) {
			System.out.print(season4data+" / ");	
		}
		
		System.out.print("\n");
		
		
		for (String name1splitData : name1split) {
		    System.out.print(name1splitData+" / ");
		}
		System.out.print("\n");
		
		Stream.of(name1split).forEach(System.out::print);

		System.out.print("\n");
		
		char charVal = name1.charAt(1);
		System.out.println(charVal);
		double no = 5 / 0.0;

		int no1 = 5;
		double no2 = 5.0;
		if (no1 == no2) {
			System.out.println(no1 == no2);

		} else {
			System.out.println(no1 == no2);
		}
		System.out.println("\n--------------------------");
		int num10=10;
		int num11=11;
		System.out.println("정수 10 / 11 -> 2진수");
		System.out.println(Integer.toBinaryString(num10) + " / " + Integer.toBinaryString(num11));

		
		
		System.out.println("\n--------------------------2진수 1010 1011 -> 10진수");
		byte[] dat= {0b1010,0b1011};
		for (byte b : dat) {
			int val = b;
			System.out.println(val);
		}

	}
}
