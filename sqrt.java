public class sqrt {
 public static void main(String[] args) {
    System.out.print("Please enter a number: ");
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
        float a = sc.nextFloat(), copy = a;
        
            double i , p = 0.1;
              for(i = 1; i * i  <= a ; i++);
              for(--i ; i * i < a ; i += p);
              System.out.println("Square root of given number  "+copy+ " is "+ i);

              sc.close();
    }
    }
 }
    
