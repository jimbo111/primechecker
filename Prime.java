import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.MAX_VALUE;
		System.out.print("Enter number to check if prime or not: ");
		
		while (number != 0) {
			number = scanner.nextInt();
			System.out.printf("Does %d is prime? %s", number, 
					isPrime(number));
			
		}
	}


public static boolean isPrime(int number) {
	int sqrt = (int) Math.sqrt(number) + 1;
	for (int i = 2; i < sqrt; i++) {
		if (number % i == 0) {
			return false;
		}
	}
	return true;
	
}














}