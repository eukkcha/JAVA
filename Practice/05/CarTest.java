class Car{
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

class ElectricCar extends Car{
	int battery;
	public void charge(int amount) {
		battery += amount;
	}
}

public class CarTest {

	public static void main(String[] args) {
		ElectricCar myCar = new ElectricCar();
		myCar.speed = 10;
		myCar.setSpeed(50);
		myCar.charge(80);
		
		Car parentCar = new Car();
		// ElectricCar mySecondCar = new Car();
	}

}
