package eArray;

public class GenericsExam {
	public GenericsExam() {
		
		Box box = new Box();
		box.setItem("hello");
		
		String str=(String) box.getItem(); 
		System.out.println(str);
		
		
		Box box3 = new Box();
		box3.setItem(333);
		
		int str3=(int) box3.getItem(); 
		System.out.println(str3);
		
		
		Box2<String> box2 = new Box2<>();
		box2.setItem("hello");
		String str2 = box2.getItem();
		System.out.println(str2);
		
		
		Box2<Integer> box4 = new Box2<>();
		box4.setItem(33333);
		int num = box4.getItem();
		System.out.println(num);

		
	}
}

class Box {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class Box2<T>{
	private T item;
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}