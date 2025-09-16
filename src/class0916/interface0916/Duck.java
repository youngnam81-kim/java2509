package class0916.interface0916;

import class0916.extends0916.Animal;

//오리 클래스 - 날고, 걷고, 수영할 수 있음
public class Duck extends Animal implements Flyable, Walkable, Swimmable {
	public Duck(String name, int age) {
		super(name, age);
		System.out.println("오리Duck 생성자호출");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "이(가) 꽥꽥 웁니다.");
	}

	@Override
	public void fly() {
		System.out.println(name + "이(가) 물 위를 날아갑니다.");
	}

	@Override
	public void land() {
		System.out.println(name + "이(가) 물 위에 착수합니다.");
	}

	@Override
	public void walk() {
		System.out.println(name + "이(가) 뒤뚱뒤뚱 걷습니다.");
	}

	@Override
	public void run() {
		System.out.println(name + "이(가) 급하게 뛰어갑니다.");
	}

	@Override
	public void swim() {
		checkWaterTemperature();
		System.out.println(name + "이(가) 물 위를 헤엄칩니다.");
	}

	@Override
	public void dive() {
		System.out.println(name + "이(가) 물 속으로 잠수합니다.");
	}

	@Override
	public void abfuction() {
		// TODO Auto-generated method stub
		
	}
}
