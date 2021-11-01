public class Printprime {
    public static void main(String[] args) {
        System.out.print("The prime numbers from 1 to 100 are : ");
        System.out.print("2");
        int num = 2, copy = 2;
        while(num !=  10){
            copy++;
            if(num%2 != 0 && copy%2 != 0){
                System.out.print(num+" ");
                System.out.print(copy+" ");
            }
            num++;
        }
    }
}

