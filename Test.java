public class Test{
    private static int taken(int i) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        i = sc.nextInt();

        return (i*i*i);
    }

    public static void main(String[] args) {
        System.out.print("Hello! \nEnter a number to find the cube: ");
        taken(i);
        System.out.print("Answer: "+i);
    }
}
