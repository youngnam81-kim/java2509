package extProject.ext;

public class Dog extends Animal{
	
	public String gubun;
	
	public Dog() {
		super();
		System.out.println("Dog()");
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String gubun) {
		this.name = name;
		this.age = age;
		this.gubun = gubun;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(", gubun="+this.gubun);
	}

	@Override
	public void sound() {
		System.out.print(name + "가 멍멍 ");
		super.sound();
	}
	
	
//	@Override
//	public void sound() {
//		System.out.print(name + "가 멍멍 ");
//		super.sound();
//	}
	
	


}
