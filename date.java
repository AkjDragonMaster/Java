import java.util.Date;
public class date {
    public static void main(String[] args) {
        Date d = new Date();
        long date = d.getTime();
        int i = 1;
        while (i < 100) {
            System.out.println(date);
            date++;
            i++;
        }
    }
}
