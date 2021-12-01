public class CCC {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Please enter a string of the following:"+'\n'+"print : (To print a number) \nrun : (to Execute a program) and \nexit : (to come out of the program) \n ------------------------------------");
        String code,c = "";
        int n = 1;
        while (n != 0) {
            System.out.print("Enter string: ");
            code = sc.nextLine();
            if(code.equals("print")){
                System.out.print("Enter whatever you want to write: ");
                c = sc.nextLine();
            }else if(code.equals("run")){
                System.out.println(c);
            }else if(code.equals("exit")){
                System.exit(0);
            }else{
                System.out.println("Please check the code");
            }
        }

        sc.close();
    }
}
