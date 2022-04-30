import java.util.Scanner;
class wholesaler {
    String[] item = {"Cricket Bat","Duce Ball","Tennis Racket","Football","Badminton Racket","Shuttlecock"};
    int[] amount = {0,0,0,0,0,0};
    void items(){
        System.out.println(item[0]+"\n"+item[1]+"\n"+item[2]+"\n"+item[3]+"\n"+item[4]+"\n"+item[5]+"\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please tell me what do you want out of the above: ");
        String inp = sc.nextLine();
        switch (inp){
            case "Cricket Bat":
                System.out.print("Please give the amount you want to buy: ");
                amount[0] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            case "Duce Ball":
                System.out.print("Please give the amount you want to buy: ");
                amount[1] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            case "Tennis Racket":
                System.out.print("Please give the amount you want to buy: ");
                amount[2] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            case "Football":
                System.out.print("Please give the amount you want to buy: ");
                amount[3] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            case "Badminton Racket":
                System.out.print("Please give the amount you want to buy: ");
                amount[4] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            case "Suttlecock":
                System.out.print("Please give the amount you want to buy: ");
                amount[5] = sc.nextInt();
                System.out.println("You have successfully bought it");
                break;
            default:
                System.out.println("Thank you for shopping");
                break;
        }
    }
    void show(){
        System.out.println(item[0]+"\n"+item[1]+"\n"+item[2]+"\n"+item[3]+"\n"+item[4]+"\n"+item[5]+"\n");
    }
}
public class Shopkeeper extends wholesaler{
    static wholesaler ws = new wholesaler();

    static int[] array = {10,10,10,10,10,10};
    static int[] a = {10,10,10,10,10,10};
    static void sell(){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        switch (inp){
            case "Cricket Bat":
                System.out.print("Please give the amount you want to buy: ");
                array[0] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[0] -= array[0];
                break;
            case "Duce Ball":
                System.out.print("Please give the amount you want to buy: ");
                array[1] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[1] -= array[1];
                break;
            case "Tennis Racket":
                System.out.print("Please give the amount you want to buy: ");
                array[2] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[2] -= array[2];
                break;
            case "Football":
                System.out.print("Please give the amount you want to buy: ");
                array[3] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[3] -= array[3];
                break;
            case "Badminton Racket":
                System.out.print("Please give the amount you want to buy: ");
                array[4] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[4] -= array[4];
                break;
            case "Suttlecock":
                System.out.print("Please give the amount you want to buy: ");
                array[5] = sc.nextInt();
                System.out.println("You have successfully bought it");
                a[5] -= array[5];
                break;
            default:
                System.out.println("Thank you for shopping");
                break;
        }
    }
    static void seenumber(){
        for (int i = 0; i < 6; i++) {
            System.out.println(ws.item[i]+" - "+a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        seenumber();
        System.out.print("Please buy from the following: ");
        sell();
        seenumber();
    }
}