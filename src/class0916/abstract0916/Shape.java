package class0916.abstract0916;

//추상 클래스
public abstract class Shape {
	protected String color;
	protected double x, y; // 위치

	public Shape(String color, double x, double y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	// 일반 메서드
	public void move(double newX, double newY) {
		this.x = newX;
		this.y = newY;
		System.out.println(color + " 도형이 (" + x + ", " + y + ")로 이동했습니다.");
	}

	// 추상 메서드 - 하위 클래스에서 반드시 구현해야 함
	public abstract double calculateArea();

	public abstract double calculatePerimeter();

	public abstract void draw();

	// 템플릿 메서드 패턴
	public final void displayShapeInfo() {
		System.out.println("=== " + getShapeType() + " 정보 ===");
		System.out.println("색상: " + color);
		System.out.println("위치: (" + x + ", " + y + ")");
		System.out.println("넓이: " + calculateArea());
		System.out.println("둘레: " + calculatePerimeter());
		draw();
	}

	protected abstract String getShapeType();
}
