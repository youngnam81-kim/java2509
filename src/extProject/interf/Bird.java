package extProject.interf;

import extProject.InheritClass.Animal;

public class Bird extends Animal implements Flyable, Walkable{
	double weight;
	
	public Bird() {

	}

	public Bird(String name, int age, double weight) {
		super(name, age, null);
		this.weight = weight;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Bird");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird");
	}
}
