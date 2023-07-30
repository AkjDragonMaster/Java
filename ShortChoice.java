import java.util.*;
public class ShortChoice
{
	boolean armstrong(int num){
	    int sum = 0;
	    for(int temp = num; temp != 0; temp/=10)
	        sum += (int) Math.pow(temp%10,3);
	    return sum == num;
	}
	boolean prime(int num){
	    int i;
	    for(i = 2; num%i != 0;i++);
	    return i > (int) Math.sqrt(num) && num > 1;
	}
	public static void main (String[] args) {
	    ShortChoice m = new ShortChoice();
	    Scanner sc = new Scanner(System.in);
	    int choice,num;
	    String s;
	    System.out.print("Enter choice :\n1. Armstrong Number\n2. Prime Number \nChoice : ");
	    choice = sc.nextInt();
	    switch(choice){
	        case 1: System.out.print("Enter number: ");
	                num = sc.nextInt();
	                s = (m.armstrong(num))? num+" is an Armstrong number": num+" is not an Armstrong number";
	                System.out.println(s);
	                break;
	        case 2: System.out.print("Enter number: ");
	                num = sc.nextInt();
	                s = (m.prime(num))? num+" is a Prime number": num+" is not a Prime number";
	                System.out.println(s);
	                break;
	       default: System.out.println("Invalid Choice!");
	    }
	}
}
