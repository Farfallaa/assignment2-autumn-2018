package worksheet02;

import java.util.Date;

public class CurrentTimeAndDate {

    public static void main(String[] args) {
       long currentTime = System.currentTimeMillis();
        Date d = new Date(currentTime);
        System.out.println(d);
    }

}
