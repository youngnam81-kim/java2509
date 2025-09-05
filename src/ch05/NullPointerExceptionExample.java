package ch05;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
//		intArray[0] = 10;	 //NullPointerException

		int[] intArray1 = {1,2,3,4};
		intArray1[0] = 10;
		System.out.println(intArray1[0]);
		
		String str = null;
		//System.out.println("총 문자수: " + str.length() );	  //NullPointerException
		
		String str1 = "";
		System.out.println("총 문자수: " + str1.length() );	  //NullPointerException
	}
}



