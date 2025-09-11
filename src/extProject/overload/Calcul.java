package extProject.overload;

public class Calcul {
	public static int cnt=300;
	public int cnt1 = 77;

	public Calcul() {
		System.out.println("=======================");
		Calculator calcul1 = new Calculator(7);
		System.out.println(Calculator.cnt);
		
		Calculator calcul2 = new Calculator(5);
		System.out.println(Calculator.cnt);
		
		System.out.println(Calcul.cnt);
		System.out.println(Calculator.cnt);

		Calculator.total=1000;
		
		System.out.println("=======================");
		System.out.println(calcul1.add(5, 3));

		int result1 = calcul1.add(5, 3);
		System.out.println(result1);
		
		double result2 =  calcul1.add(7.5, 3.7);
		System.out.println(result2);
		
		int result3 = calcul2.add(5, 3, 3);
		System.out.println(result3);
		System.out.println("=======================");
		
		System.out.println(Calculator.cnt);
		System.out.println(calcul1.cnt1);
		Calcul calcul = new Calcul();
		System.out.println(calcul.cnt1);
	}

}
