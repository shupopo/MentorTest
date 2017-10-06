package Honban;

abstract class Vehicle {
	protected int speed;
	public void setSpeed(int s){
		this.speed = s;
		System.out.println("速度を"+speed+"にしました");
	}
	abstract void showSpeed();
}
