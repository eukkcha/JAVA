
public class ECar {
	private int distance; // 주행한 거리
	private int battery; // 남은 배터리
	
	// 싱글톤 패턴 구현
	private static ECar instance = null; // 처음엔 null 지정 
	private ECar() { // 전용 생성자
		this.distance = 0; // 주행거리 초기값 0km
		this.battery = 100; // 배터리 초기값 100%
	}
	
	public static ECar getInstance() { // 인스턴스 생성
		if(instance==null) {
			instance = new ECar(); // 처음이면 ECar 인스턴스 생성
		}
		return instance; // 중복이면 생성되있던 인스턴스 반환
	}
	
	public void dispDistance() {
		System.out.println("주행거리: " + distance + "km"); // 총 주행거리 출력
	}
	
	public void dispBattery() {
		System.out.println("배터리: " + battery + "%"); // 남은 배터리 출력
	}
	
	public void drive() {
		if(battery>=10) { // 배터리가 남으면 ㄱㄱ
			distance ++; // +1km
			battery -=10; // -10%
			System.out.println("1km 주행");
		}
		else { // 배터리가 없으면 오류남
			System.out.println("오류: 배터리 부족함"); // 오류문 출력
		}
	}
	
	public static void main(String[] args) {
		ECar car = ECar.getInstance();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive(); // 6번 drive 했음 (내 임의로)
        car.dispDistance();
        car.dispBattery();
	}

}
