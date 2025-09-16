package class0916.extends0916;

//자식 클래스 (개)
public class Dog extends Animal {

	private String breed; // 품종

	public Dog(String name, int age, String breed) {
		super(name, age); // 부모 생성자 호출
		this.breed = breed;
		System.out.println("Dog 생성자 호출");
	}

	// 메서드 오버라이딩
	@Override
	public void makeSound() {
		System.out.println(name + "이(가) 멍멍 짖습니다.");
	}

	// 자식 클래스만의 메서드
	public void wagTail() {
		System.out.println(name + "이(가) 꼬리를 흔듭니다.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo(); // 부모 메서드 호출
		System.out.println("품종: " + breed);
	}

	@Override
	public void abfuction() {
		// TODO Auto-generated method stub
		
	}

}
