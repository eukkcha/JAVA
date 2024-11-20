import java.util.Scanner;

public class Add2 {

	public static void main(String[] args) {
		
		int x, y, sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input First Digit: ");
		x = sc.nextInt();
		
		System.out.print("Input Second Digit: ");
		y = sc.nextInt();
		
		sum = x + y;
		
		System.out.printf("%d + %d = %d\n", x, y, sum);
	}

}

