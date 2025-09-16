package class0916.interface0916;

public interface Eatable2 {
	
	public void eat();
	
	public default void test() {
		System.out.println("이것은 default method");
	}

}
