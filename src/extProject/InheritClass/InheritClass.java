package extProject.InheritClass;

import extProject.abstrac.AbstractClass;

public class InheritClass {
	public InheritClass () {
		Dog dog = new Dog("멍멍이",1,"멍멍");
		Cat cat = new Cat("냐옹이",2,"야옹");
		
		dog.eat();
		dog.breeds();
		dog.makeSound();
		
		cat.eat();
		cat.makeSound();
		
		Animal ani = dog;
		ani.eat();
		dog.makeSound();
		
		//형변환
		Animal aniDog = new Dog(); // Dog 객체를 Animal 참조변수에 담음
		if(aniDog instanceof Dog) {
		    dog = (Dog)aniDog; // 안전한 캐스팅
		}
		
		//강제형변환
		Dog dogAni = (Dog)ani;
		dogAni.breeds();
		dogAni.eat();
		dogAni.makeSound();
		
		AbstractClass abstractClass = new AbstractClass();
		
		
	}
	
	
}
