import java .util.*;
public class one2 {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int one = foo.nextInt(),i = 0,c = 0,copy = one;
        while (i < one/10) {
          if (one/10 == 1) {
              c++;
          }
          if(one%10 == 1){
            c++;
          }
          one /=10;
        }
        System.out.println("The 1's are "+c);
        i = 0;
        c = 0;
        while (i < copy/10) {
            if (copy/10 == 2) {
                c++;
            }
            if(copy%10 == 2){
              c++;
            }
            copy /=10;
          }
        System.out.println("The 2's are "+c);
        
        foo.close();
    }
}
