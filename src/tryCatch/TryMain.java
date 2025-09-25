package tryCatch;

public class TryMain {

	public static void main(String[] args) throws Exception {
		try {
			
			int[] myNums1 = { 1, 2, 3 };
			System.out.println(myNums1[1]);
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("연산오류");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 오류");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			int[] myNums2 = { 1, 2, 3, 4, 5 };
			System.out.println(myNums2[10]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main-Exception");
		} finally {
			System.out.println("무조건 실행함.");
		}

		chackAge(17);
	}

	private static void chackAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception();
		} else {
			System.out.println("성인 OK");
		}

	}
}
