import java.util.Scanner;

public class PrimeGenerator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the maximum value: ");
		int number = Integer.MAX_VALUE, MaxValue = scanner.nextInt(), count = 0;
		
		for (number = 2; number <= MaxValue; number++) {
			if (isPrime(number) == true) {
				count ++;
				System.out.println(number);
			}
		}
		//System.out.print("There are " + count + " of prime numbers within " + MaxValue);
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
