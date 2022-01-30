import java.lang.Math;
public class Computer_guesses_number
{
	public static void main(String[] args) {
	    java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Hello! \nDo you want to play a game?");
		System.out.println("1 for Yes \n2 for No");
		System.out.print("Answer: ");
		int ans = sc.nextInt();
		if(ans == 1){
		    System.out.println("Ok! So, first choose an integer in your mind");
		    System.out.println("Now, divide it by 5.");
		    System.out.println("Next! multiply it by 4.");
		    System.out.println("Now, again, multiply it by 2");
		    System.out.print("Good! Now give me the number you got - ");
		    double num = sc.nextFloat();
		    double ogNum = num * 0.625;
		    if(num%5 != 0 || num%2 != 0){
		       System.out.println("Your original number is "+Math.round(ogNum)); 
		    }else{
		       System.out.println("Your original number is "+ogNum); 
		    }
		}else{
		    System.out.println("Oh! Sorry to disturb you.");
		}
		
	}
}
