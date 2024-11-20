// 주사위를 Dice 클래스로 모델링
public class Dice {
	// 주사위면(face)을 필드로 가짐
	private int face;
	
	// 생성자는 주사위면을 0으로 초기화함
	public Dice() {
		face = 0;
	}
	
	// 1에서 6까지 랜덤 숫자를 고름
	public void roll() {
		face = (int)(Math.random() * 6) + 1;
	}
	
	// 주사위의 현재 값을 반환함 
	public int getValue() {
		return face;
	}
	
	// 주사위의 값을 설정함 
	public void setValue(int value) {
		if (value >=1 && value <=6) 
			face = value;
		else
			System.out.println("유효하지 않은 값임. 다시 입력하셈.");
	}
	
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		int cnt = 0; // (1,1)이 나올 때까지 시도한 횟수
		
		do {
			d1.roll();
			d2.roll();
			cnt++;
			
			System.out.println("주사위1= " + d1.getValue() + " 주사위2= " + d2.getValue());
		} while (!(d1.getValue() == 1 && d2.getValue() == 1));
		
		System.out.println("(1, 1)이 나오는 데 걸린 횟수= " + cnt);
	}
}