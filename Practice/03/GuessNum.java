import java.util.*;

public class GuessNum {

	public static void main(String[] args) {

		int answer = (int)(Math.random() * 100 + 1);
		int guess;
		Scanner sc = new Scanner(System.in);
		int tries = 0;
		
		do
		{
			System.out.println("Input your number: ");
			guess = sc.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("Your number is higher.");
			if (guess < answer)
				System.out.println("Your number is lower.");
		}while(answer != guess);
		
		System.out.println("You tried " + tries + " times.");

	}

}
