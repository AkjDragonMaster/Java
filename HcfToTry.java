import java.util.Scanner;
public class HcfToTry {
    public static int findHCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        }
        return num1;
    }
    public static void main(String[] args){
        int  i, hcf = 0;
        int[] fn = new int[0];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        for (int j = 1;sc.hasNext(); j++) {
            try {
                fn = new int[j];
                fn[j - 1] = sc.nextInt();
            }catch(Exception e){
                System.out.print(e);
            }
            if(j%2 == 0){
                System.out.println("Do you want to stop or continue(1 = yes; 2 = no): ");
                hcf = sc.nextInt();
                if(hcf == 1){
                    break;
                }
            }
        }
        hcf = fn[0];
        for(i=1; i<fn.length; i++) {
            hcf = findHCF(hcf, fn[i]);
        }

        System.out.println("HCF of numbers is: "+hcf);
    }
}
