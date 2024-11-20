class Box {
	int width, length, height;
	
	public Box() {} // 안 적어도 자동으로 만들어짐.
	
	int getVolume() {
		return width * length * height;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box b;
		b = new Box();
		
		b.width = 5;
		b.length = 10;
		b.height = 15;
		
		System.out.println("V= " + b.getVolume());
	}

}
