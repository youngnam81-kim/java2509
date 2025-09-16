package class0916.abstract0916;

public class Rectangle extends Shape {
	private double width, height;

	public Rectangle(String color, double x, double y, double width, double height) {
		super(color, x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (width + height);
	}

	@Override
	public void draw() {
		System.out.println("가로 " + width + ", 세로 " + height + "인 사각형을 그립니다.");
	}

	@Override
	protected String getShapeType() {
		return "사각형";
	}
}
