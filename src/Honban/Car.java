package Honban;

public class Car extends Vehicle {
	@Override
	void showSpeed() {
		System.out.println("この車のスピードは" + super.speed + "です。");
	}
}
