package extProject.InheritClass;

public class Dog extends Animal{

	public Dog(String name, int age, String sound) {
		super(name, age, sound);
	}

	public Dog() {
		super();
	}
	
	
	@Override
	public void makeSound() {
//		super.makeSound();
		System.out.println("멍멍 소리를 냅니다.");
	}



	public void breeds() {
		System.out.println("멍멍이는 산책을 합니다.");
	}
}
