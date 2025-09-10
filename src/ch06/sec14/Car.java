package ch06.sec14;

public class Car {
	//필드 선언 
	private int speed;
	private boolean stop=false;
	
	//speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		System.out.println(this.stop);
		if(speed <= 0) { 
			this.speed = 0;
			this.stop = true;
			return;
		} else {
			this.speed = speed;
			this.stop = false;
		}
	}

	//stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
