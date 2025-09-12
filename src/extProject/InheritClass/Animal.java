package extProject.InheritClass;

public class Animal {
	String name;
	int age;
	String sound;
	
	public Animal(){
		
	}
	
	public Animal(String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.sound = sound;
		System.out.println( this.toString() );
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sound=" + sound + "]";
	}
	
	public void makeSound() {
		System.out.println("Animal - 소리를 냅니다.");
	}
	
	public void eat() {
		System.out.println("Animal - 먹어요.");
	}
	
}
