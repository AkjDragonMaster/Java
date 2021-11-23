import java.util.*;
public class peterson {
    public static void main(String[] args) {
        Scanner peter = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int c = peter.nextInt();
        int  i = 0,div = 0,sum = 0,fac= 1,b = 1;
        while (i <= c) {
           int rem = c/10;
            div = c%10;
            while (b <= rem) {
                fac = fac*b;
                b++;
            }
            sum = sum + fac;
            i++;
            b =1;
        }
        b = 1;
            while (b <= div) {
                fac = fac*b;
            }
            sum = sum + fac;
            if (sum == c) {
                System.out.println("It is a petersons number");
            }else{
                System.out.println("It is not a petersons number");
            }
        
        peter.close();
    }
}

