public class SecondHighest {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Please enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Please enter the numbers: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int l = a[0];
        int sL = a[0];
        for(int x = 0 ; x < size; x++){
            if(a[x] > l){
                sL = l;
                l = a[x] ;
            }else if (a[x] > sL) {
                sL = a[x];
            }
        }
        System.out.println("The second largest number is "+sL);
    }
}
