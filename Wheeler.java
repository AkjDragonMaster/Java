import java.util.Scanner;
public class Wheeler {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int v=sc.nextInt();
            int w=sc.nextInt();
            int res=((4*v)-w)/2;
            if(v > res)
            System.out.println("TW= "+res+" FW= "+(v-res));
            else
            System.out.println("Please enter w greater that v");
            }
}
