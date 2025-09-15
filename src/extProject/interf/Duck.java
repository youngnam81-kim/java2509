package extProject.interf;

import extProject.InheritClass.Animal;

public class Duck extends Animal implements Flyable, Walkable, Swimmable{
	public Duck() {

	}

	public Duck(String name, int age) {
		super(name, age, null);
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("뒤뚱뒤뚱 걸어요.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("푸덕푸덕 날이요.");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("어푸어푸 수영해요.");
	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println("풍덩풍덩 빠져요.");
	}

}
