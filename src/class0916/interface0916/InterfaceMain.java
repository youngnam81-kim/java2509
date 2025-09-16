package class0916.interface0916;

public class InterfaceMain {
	public InterfaceMain() {
		Bird bird = new Bird("참새", 1, 25.5);
		Duck duck = new Duck("도널드", 3);

		// 각 동물의 기본 행동
		bird.makeSound();
		duck.makeSound();

		System.out.println("\n=== 새의 행동 ===");
		bird.fly();
		bird.walk();
		bird.land();

		System.out.println("\n=== 오리의 행동 ===");
		duck.fly();
		duck.swim();
		duck.walk();
		duck.dive();

		// 인터페이스 타입으로 참조
		System.out.println("\n=== 인터페이스 활용 ===");
		Flyable[] flyingAnimals = { bird, duck };
		for (Flyable flyer : flyingAnimals) {
			flyer.fly();
		}

		// 다형성과 인터페이스
		testSwimming(duck); // Duck은 Swimmable을 구현
	}

	public static void testSwimming(Swimmable swimmer) {
		System.out.println("\n수영 테스트:");
		swimmer.swim();
		swimmer.dive();

	}
}
