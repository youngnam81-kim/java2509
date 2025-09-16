package class0916.interface0916;

import class0916.extends0916.Animal;

//새 클래스 - 날 수 있고 걸을 수 있음
public class Bird extends Animal implements Flyable, Walkable {

	private double wingspan; // 날개폭

	public Bird(String name, int age, double wingspan) {
		super(name, age);
		this.wingspan = wingspan;
		System.out.println("참새Bird 생성자호출");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "이(가) 짹짹 웁니다.");
	}

	@Override
	public void fly() {
		checkWeather(); // default 메서드 호출
		System.out.println(name + "이(가) 날개폭 " + wingspan + "cm로 날아갑니다.");
	}

	@Override
	public void land() {
		System.out.println(name + "이(가) 착륙합니다.");
	}

	@Override
	public void walk() {
		System.out.println(name + "이(가) 두 다리로 걷습니다.");
	}

	@Override
	public void run() {
		System.out.println(name + "이(가) 빠르게 뛰어갑니다.");
	}

	@Override
	public void abfuction() {
		System.out.println("추상 클래스의 추상 메서드인 abfuction 구현"); 
		
	}

}
