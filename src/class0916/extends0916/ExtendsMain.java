package class0916.extends0916;

public class ExtendsMain {
	public ExtendsMain() {
		// 다양한 동물 객체 생성
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);

		System.out.println("=== 강아지 정보 ===");
		dog.displayInfo();
//		dog.eat();
		dog.makeSound();
		dog.wagTail();

		System.out.println("\n=== 고양이 정보 ===");
		cat.displayInfo();
//		cat.eat();
		cat.makeSound();
		cat.climb();
	}
}
