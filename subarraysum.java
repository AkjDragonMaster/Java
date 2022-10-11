import java.util.Scanner;
public class subarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a sum of a sub-array: ");
        int S = sc.nextInt();
        System.out.print("Please enter the size of the array: ");
        int N = sc.nextInt();
        System.out.print("Please enter an array of positive integers: ");
        int[] positive = new int[N];
        for (int i = 0; i < N; i++) {
            positive[i] = sc.nextInt();
            if(positive[i] < 0) {
                System.out.println("Please enter a positive number");
                System.exit(0);
            }
        }
        subarray(positive,S);
    }
    private static void subarray(int[] a, int sum){
        int s = 0,s1 = 0,s2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                s1 += a[j];
                if(s1 == sum){
                    s = s1;
                    for (int k = j; k >= 0; k--) {
                        s -= a[k];
                        if(s == 0) {
                            System.out.println((k+1) + " " +(j+1));
                            System.exit(0);
                        }

                    }
                }
            }
            s1 = 0;
        }
    }
}
