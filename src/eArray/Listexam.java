package eArray;

import java.util.ArrayList;

public class Listexam {
	public Listexam() {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);
	    
	    ArrayList<String> arrList  = new ArrayList<String>();
	    System.out.println();
	    System.out.println(myNumbers);
	    
	    arrList.add("사과");
	    arrList.add("포도");
	    arrList.add("바나나");
	    arrList.add("포도2");
	    arrList.add("사과2");
	    
	    System.out.println(arrList);
	    System.out.println("세번째 배열 : "+arrList.get(2));
	    
	    arrList.set(4, "파인애플");
	    System.out.println("5번째 사과2를 파인애플로 바꿨더니 : "+arrList);
	    
	    arrList.remove(3);
	    
	    System.out.println("4번째 포도2를 remove 했더니 : "+arrList);
	    
	    
	    System.out.println("foreach");
	    //foreach
	    for (String arr : arrList) {
			System.out.print(arr+", ");
		}
	    
	    System.out.println();
	    System.out.println("for i++");
	    
	    //for i++
	    for ( int i = 0; i<arrList.size() ; i++) {
	    	System.out.print(arrList.get(i)+", ");
	    }
	    
	    System.out.println();
	    
	}
}
