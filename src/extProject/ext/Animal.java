package extProject.ext;

public class Animal {
	
	protected String name=null;
	protected int age=0;
	
	public Animal() {
		System.out.println("Animal()");
	}
	
	public Animal(String name, int age) {
		System.out.println("Animal(name,age)");
		this.name = name;
		this.age = age;
	}

	public void sound() {
		System.out.println("소리를 냅니다.");
	}
	
	public void displayInfo() {
		System.out.print("name=" + name + ", age=" + age);
	}
	
}
