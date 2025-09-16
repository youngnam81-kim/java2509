package class0916.abstract0916;

public class AbstractMain {

	public AbstractMain() {

		Circle circle = new Circle("red", 10.0, 20.0, 5.0);
		Rectangle rectangle = new Rectangle("blue", 50.0, 20.0, 10.0, 5.0);

		circle.draw();
		rectangle.draw();
	}
}
