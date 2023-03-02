
import java.util.Scanner;

public class generateNumbers {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner (System.in);
		
		int number = (int) (Math.random() * 100 );
		
		System.out.println("make a guess");
		int guess = scan.nextInt();
		
		while ( guess != number) {
			
			if ( guess < number) {
				
				System.out.println("your guess is too low guess again");
				guess = scan.nextInt();
			}
			else {
				System.out.println("your guess is too high");
			    guess = scan.nextInt(); }
			
		}
		System.out.println("you're correct");

	}

}
