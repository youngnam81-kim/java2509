package extProject.ext;

public class Cat extends Animal {
	
	public String gubun;
	
	public Cat() {
		super();
		System.out.println("Cat()");
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String gubun) {
		super(name, age);
		this.gubun = gubun;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println(", gubun="+this.gubun);
	}

	@Override
	public void sound() {
		System.out.print(name + "가 냐옹 ");
		super.sound();
	}
}
