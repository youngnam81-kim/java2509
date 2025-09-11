package extProject.ext;

public class Exten {

	/**
	 *	상속기능 구현 
	 */
	public Exten() {
		// 상속 기능 구현
		//Dog dog1 = new Dog();
		//Cat cat1 = new Cat();
		
		Dog dog = new Dog("똘이",2);
		Cat cat = new Cat("나비",4);
		
		Dog dogOri = new Dog("똘이",2,"진돗개");
		Cat catOri = new Cat("나비",4,"길냥이");
		
//		dog.name="나의 멍멍이";
//		cat.name="나의 냐옹이";
		
		System.out.println(dog.name+" / "+dog.age);
		System.out.println(cat.name+" / "+cat.age);
		
		System.out.println(dogOri.name+" / "+dogOri.age+" / "+dogOri.gubun);
		System.out.println(catOri.name+" / "+catOri.age+" / "+catOri.gubun);
		
//		System.out.println(dogOri.displayInfo());
//		System.out.println(catOri.displayInfo());
		
		dogOri.displayInfo();
		catOri.displayInfo();
		
		dog.sound();
		cat.sound();
		
		
	}
	
	
}
