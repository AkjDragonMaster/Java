public class Table
{
	private static int table(int i) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        i = sc.nextInt();
        for (int a = 1; a < 10; a++){
            System.out.println(i+" x "+a+" = "+(a*i));
        } 
        System.out.print(i+" x "+ 10 +" = ");
        return (10 * i);
    }

    public static void main(String[] args) {
        int z = 0;
        System.out.print("Enter a number to find it's table - ");
        System.out.print(table(z));
    }
}
