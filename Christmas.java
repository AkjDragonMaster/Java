public class Christmas {
    public static void main(String[] args) {
        int i,j, n= 16,l= 0;
        
        for(i=1;i<=n;i++)
     {
         for(j=i;j<=n;j++)
         {
             System.out.print(" ");
         }
         for(j=1;j<=i;j++)
         {
             System.out.print("* ");
         }
         System.out.println("");

     }
     System.out.print("             ");
     for (int index = 0; index < 20; index++) {
         System.out.print("* ");
         l++;
         if(l%4==0){
            System.out.println("");
            System.out.print("             ");
         }
     }
    
    } 
    }

