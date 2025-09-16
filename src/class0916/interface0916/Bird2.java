package class0916.interface0916;

import class0916.extends0916.Animal;

public class Bird2 extends Animal implements Flyable2, Eatable2 {

	String house;
	
	public Bird2(String name, int age) {
		super(name, age);
		this.house = "집이 없습니다.";
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Bird2 [house=" + house + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abfuction() {
		// TODO Auto-generated method stub
		
	}

	
}
