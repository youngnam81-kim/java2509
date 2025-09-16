package class0916.polymorphism0916;

import class0916.extends0916.Animal;
import class0916.extends0916.Cat;
import class0916.extends0916.Dog;

public class PolymorphismMain {

	public PolymorphismMain() {
		// 다형성 배열
		Animal[] animals = { 
				new Dog("바둑이", 5, "진돗개"), 
				new Cat("나비", 3, false), 
				new Dog("체리", 2, "푸들"),
				new Cat("까망이", 4, true) 
				};

		System.out.println("=== 모든 동물들의 소리 ===");
		for (Animal animal : animals) {
			animal.makeSound(); // 다형성 - 각각 오버라이딩된 메서드 호출
		}

		System.out.println("\n=== 동물별 특별한 행동 ===");
		for (Animal animal : animals) {
			// instanceof를 이용한 타입 체크
			if (animal instanceof Dog) {
				Dog dog = (Dog) animal; // 다운캐스팅
				dog.wagTail();
			} else if (animal instanceof Cat) {
				Cat cat = (Cat) animal; // 다운캐스팅
				cat.climb();
			}
		}

		// 다형성 메서드 호출
		playWithAnimal(new Dog("루피", 1, "비글"));
		playWithAnimal(new Cat("츄츄", 2, true));
	}

	// 다형성을 이용한 메서드
	public static void playWithAnimal(Animal animal) {
		System.out.println("\n" + animal.getName() + "와(과) 놀아주기:");
		animal.eat();
		animal.makeSound();

		// 타입별 특별한 놀이
		if (animal instanceof Dog) {
			((Dog) animal).wagTail();
		} else if (animal instanceof Cat) {
			((Cat) animal).climb();
		}
	}
}
