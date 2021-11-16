import java.util.*;
public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spy = sc.nextInt();
        int i = 1, rem = 0, sum = 0, mul = 1;
        while (i <= spy) {
            rem = spy % 10;
            mul = mul * rem;
            sum = sum + rem;
            spy /= 10;
        }
        if(sum == mul){
            System.out.print("This number is a spy number");
        }else{
            System.out.print("This number is not a spy number");
        }

        sc.close();
    }
}
