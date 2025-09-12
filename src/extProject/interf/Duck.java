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
		System.out.println("Duck");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println("Duck");
	}

}
