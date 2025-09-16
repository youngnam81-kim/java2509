package class0916.extends0916;

//부모 클래스 (동물)
public abstract class Animal {
	protected String name;
	protected int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Animal 생성자 호출");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "이(가) 먹이를 먹고 있습니다.");
	}

	public void sleep() {
		System.out.println(name + "이(가) 잠을 자고 있습니다.");
	}

	public void makeSound() {
		System.out.println(name + "이(가) 소리를 냅니다.");
	}

	public void displayInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + "살");
	}
	
	public abstract void abfuction();
}
