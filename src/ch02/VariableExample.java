package ch02;
public class VariableExample {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("System.out.println 및 변수 사용법");
		System.out.println("안녕");
		System.out.println("\n-----------------------------------------VariableInitialization");
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		System.out.println("\n-----------------------------------------VariableUse");
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + '분');
		int totalMinute = ((hour * 60) + minute);
		System.out.println("분으로 환산 : " + totalMinute + "분");
		System.out.println("\n-----------------------------------------VariableExchange");
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + " y: " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x : " + x + " y: " + y);
		System.out.println("\n-----------------------------------------기본 데이터 타입 크기 출력");
		System.out.println("논리형(boolean) 크기: " + 1 + " bit");
		System.out.println("문자형(char) 크기: " + Character.SIZE + " bit");
		System.out.println("정수형(byte) 크기: " + Byte.SIZE + " bit");
		System.out.println("정수형(short) 크기: " + Short.SIZE + " bit");
		System.out.println("정수형(int) 크기: " + Integer.SIZE + " bit");
		System.out.println("정수형(long) 크기: " + Long.SIZE + " bit");
		System.out.println("실수형(float) 크기: " + Float.SIZE + " bit");
		System.out.println("실수형(double) 크기: " + Double.SIZE + " bit");

		// 2. 데이터 타입별 값의 범위 출력
		System.out.println("\n----------------------------------------- 데이터 타입별 값의 범위");
		System.out.println("byte 범위: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 범위: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long 범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println("float 범위: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println("double 범위: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

		// 3. 타입 변환 시 주의사항 예제
		System.out.println("\n----------------------------------------- 타입 변환 예제");
		int intValue = 128;
		byte byteValue = (byte) intValue; // 큰 타입에서 작은 타입으로 변환 시 데이터 손실 발생 가능
		System.out.println("int 128을 byte로 변환: " + byteValue + " = >큰 타입에서 작은 타입으로 변환 시 데이터 손실 발생 가능 (-128 출력 (오버플로우)");

		long longValue = 100;
		int intValue2 = (int) longValue; // 데이터 손실 없음 (값이 int 범위 내에 있음)
		System.out.println("long 100을 int로 변환: " + intValue2 + " => 데이터 손실 없음 (값이 int 범위 내에 있음)");

	}

}
