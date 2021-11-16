import java.util.*;
public class rangeN {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a initial number: ");
        int neon = n.nextInt();
        System.out.print("Enter a final number: ");
        int neon2 = n.nextInt();
        System.out.print("The neon numbers in this range are: ");
        int sqr = neon * neon, rem = 0, sum = 0;
       for (int i = neon; i <= neon2; i++) {
        for (int j = 1; j != 0; j++) {
            rem = sqr % 10;
            sum = sum + rem;
            sqr /= 10;
        }
        if(i == sum){
            System.out.print(i);
        }
    }

        
        n.close();
    }
}
