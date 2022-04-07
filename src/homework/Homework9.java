package homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework9 {
    public static void main(String[] args) {
        myTimeline(4);


    }

    public static void myTimeline(int recData) {
        SimpleDateFormat myDate = new SimpleDateFormat("ha");
        Calendar myCl = Calendar.getInstance();
        System.out.print("Now");
        for (int i = 1; i < recData; i++) {
            myCl.add(Calendar.HOUR, 2);
            Date dateCal = myCl.getTime();
            System.out.print(" " + myDate.format(dateCal).toLowerCase());

        }

    }
}
