import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < 50; i = i + 10){
		    if(num < 50){
		    int x = i + 10;
		    if(num >= i && num <= x){
		        System.out.println("Your number range is from "+i+" to "+x);
		    }
		    }else{
		        System.out.println("Your number range is above 50");
		        System.exit(0);
		    }
		}
	}
}
