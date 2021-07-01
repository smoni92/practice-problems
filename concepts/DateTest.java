package concepts;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateTest {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date pastDate = new Date(currentDate.getTime() - 1000*60);
        System.out.println(pastDate);

        System.out.println("Compare To: " + currentDate.compareTo(pastDate));
        System.out.println("Diff: " + TimeUnit.MILLISECONDS.toMillis(currentDate.getTime() - pastDate.getTime()));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MILLISECOND, -1000*60);
        //calendar.setTimeInMillis(1000*60);

        System.out.println(calendar.getTime());

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.MILLISECOND, -1000*60);
        System.out.println(gregorianCalendar.getTime());
    }
}
