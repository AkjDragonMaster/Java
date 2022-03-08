import java.util.Scanner;

public class parking {
    public static void main(String[] args) {
        int a = 0;
        while(a < 5) {
            Scanner sc = new Scanner(System.in);
            int parking[] = {0, 0, 0, 0, 0};
            System.out.print("Please enter a number from 1 to 5 to choose a parking seat: ");
            int pseat = sc.nextInt(), i = 0;
            while (i < 5) {
                if (parking[i] == 0) {
                    switch (pseat) {
                        case 1:
                            parking[0] = 2;
                            break;
                        case 2:
                            parking[1] = 4;
                            break;
                        case 3:
                            parking[2] = 6;
                            break;
                        case 4:
                            parking[3] = 8;
                            break;
                        case 5:
                            parking[4] = 10;
                    }
                    System.out.print("This seat is empty so you can park here");
                } else {
                    System.out.print("Sorry but this seat has already been taken");
                    System.exit(0);
                }
                i++;
            }
            a++;
        }

        }
    }
