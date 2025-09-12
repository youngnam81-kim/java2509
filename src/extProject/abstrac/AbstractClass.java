package extProject.abstrac;

public class AbstractClass {

	public AbstractClass() {
		Circle circle= new Circle("red",10.0,10.0,5.0);
		Rectangle rectangle = new Rectangle("blue",10.0,5.0);
		
		System.out.println(circle.getShapType());
		System.out.println(rectangle.getShapType());
	}
}
