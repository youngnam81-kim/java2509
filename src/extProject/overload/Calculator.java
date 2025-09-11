package extProject.overload;

public class Calculator {
	public static int cnt;
	public int cnt1 = 99;
	public static int total;
	
	public Calculator(int arg){
		this.cnt = arg;
	}
	
	public int add(int i, int j) {
		cnt++;
		return i+j;
	}
	
	public double add(double i, double j) {
		cnt++;
		return i+j;
	}

	public int add(int i, int j, int k) {
		cnt++;
		return i+j+k;
	}

	
}

