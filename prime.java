import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int i = 2, num;
        Scanner prime = new Scanner(System.in);
		System.out.print("Enter number to find out the prime factor: ");
		num = prime.nextInt();
		System.out.print("The prime factors are: ");
		while(i > 0) {
			if(num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			} else if(num / i == 0) {
				break;
			} else {
				i++;
			}
         }
         prime.close();
	}

}