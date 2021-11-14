import java.util.Scanner;
public class simple_prime {
    public static void main(String[] args) {
        
        Scanner prime = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int p = prime.nextInt(), copy = 0;
        
        for(int i = 2; i <= p; i++){
            if(p%i == 0){
                break;
            }else{
                i++;
                copy = i;
            }
        }
       
        if (copy == p) {
            System.out.print("The number is a prime number");
        }else{
            System.out.print("The number is not a prime number");
        }

        prime.close();
    }
}
