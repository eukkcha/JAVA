public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(0);
		
		c1.radius = 100;
		c1.color = "blue";
		
		double area = c1.getArea();
		System.out.println("Area : " + area);
	}

}
