class Rect {
	int w, h;
	
	public Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	int getArea() {
		return w * h;
	}
}

public class RectTest {
	
	public static void main(String[] args) {

		Rect[] arr = new Rect[3];
		
		for (int i=0;i<arr.length;i++)
			arr[i] = new Rect(i, i + 5);
		
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i].getArea());
	}

}
