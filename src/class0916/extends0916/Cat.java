package class0916.extends0916;

//자식 클래스 (고양이)
public class Cat extends Animal {

	private boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
		System.out.println("Cat 생성자 호출");
	}

	@Override
	public void makeSound() {
		System.out.println(name + "이(가) 야옹 웁니다.");
	}

	public void climb() {
		System.out.println(name + "이(가) 나무를 올라갑니다.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("실내묘: " + (isIndoor ? "예" : "아니오"));
	}

	@Override
	public void abfuction() {
		// TODO Auto-generated method stub
		
	}

}
