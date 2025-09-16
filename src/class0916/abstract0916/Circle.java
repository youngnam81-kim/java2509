package class0916.abstract0916;

//원 클래스
public class Circle extends Shape {
	private double radius;

	public Circle(String color, double x, double y, double radius) {
		super(color, x, y);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름 " + radius + "인 원을 그립니다.");
	}

	@Override
	protected String getShapeType() {
		return "원";
	}
}
