package class0916.interface0916;

public interface Flyable {
	double MAX_ALTITUDE = 10000; // public static final 생략

	void fly(); // public abstract 생략

	void land();

	// Java 8부터 가능한 default 메서드
	default void checkWeather() {
		System.out.println("날씨를 확인합니다.");
	}
}
