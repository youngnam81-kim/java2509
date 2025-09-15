package extProject.interf;

public class InterfaceClass {

	public InterfaceClass() {
		// TODO Auto-generated constructor stub
		Bird bird = new Bird("참새", 1, 25.5);
//		System.out.println(bird.weight);
//		bird.fly();

		Duck duck = new Duck("도널드", 3);
//		duck.walk();
//		duck.swim();

		Walkable[] walkableArr = { bird, duck };
		for (Walkable walk : walkableArr) {
			walk.walk();
		}

		Flyable[] flyableArr = { bird, duck };
		for (Flyable fly : flyableArr) {
			fly.fly();
		}

		testSwim(duck);
		//testSwim(bird); // 에러 남 인터페이스를 하지 않았음.

		testWalk(bird);
		testWalk(duck);
		
	}

	public static void testSwim(Swimmable swimmable) {
		swimmable.dive();
	}

	public static void testWalk(Walkable walkable) {
		walkable.walk();
	}

}
