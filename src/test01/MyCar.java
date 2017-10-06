package test01;

public class MyCar extends AbstractAutomobile {

	private int capacity;
	private String carModel;

	public MyCar() {
		super(CarType.STANDARD_CAR);
		capacity = 7;
		carModel = "自家用ワンボックス車";
	}

	@Override
	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public String getCarModel() {
		return this.carModel;
	}

}
