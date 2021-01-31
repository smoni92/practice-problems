package concepts;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateTest {

    public static void main(String[] args) {

        Date currentdate = new Date();
        System.out.println(currentdate);

        Date pastdate = new Date(currentdate.getTime() - 1000*60);
        System.out.println(pastdate);

        System.out.println("Compare To: " + currentdate.compareTo(pastdate));
        System.out.println("Diff: " + TimeUnit.MILLISECONDS.toMillis(currentdate.getTime() - pastdate.getTime()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MILLISECOND, -1000*60);
        //calendar.setTimeInMillis(1000*60);

        System.out.println(calendar.getTime());

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.MILLISECOND, -1000*60);
        System.out.println(gregorianCalendar.getTime());
    }
}
