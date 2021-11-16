import java.util.*;
public class spy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spy = sc.nextInt();
        int spy3 = sc.nextInt();
        int i = 1, rem = 0, sum = 0, mul = 1;
        for (int j = spy; j < spy3; j++) {
        while (i <= spy3) {
            rem = spy % 10;
            mul = mul * rem;
            sum = sum + rem;
            spy /= 10;
        }
        if(mul == sum){
            System.out.print(mul+" ");
        }
    }

        sc.close();
    }
}
