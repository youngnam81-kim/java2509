package day01_0901.ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1 - 10;
			System.out.println(v2);
		}
//		System.out.println(v2);v2를 사용할 수 없기에 컴파일러 에러 발생
//		int v3 = v1 + v2 + 5; // v2를 사용할 수 없기에 컴파일러 에러 발생
	}

}
