import java.util.Scanner;
public class p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean prime;
        System.out.println("Please enter a number");
        double num = sc.nextDouble();
        double x;
        if (num == 0 || num == 1) {
            prime = false;
        }
        for (double i = 2; i <= Math.sqrt(num); i++) {
            x = num % i;
            if (x == 0) {
                prime = false;
                break;

            }
            if(prime = false){
                System.out.println("Not prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
}
