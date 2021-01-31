package concepts;

import java.util.concurrent.TimeUnit;

public class TimeConversionsTest {

    public static void main(String[] args) {

        //Output: 28800000 in both cases
        System.out.println("Eight Hours in Millis (Direct Conversion): " + (8*60*60*1000));

        long eightHoursInMillisTimeUnit = TimeUnit.HOURS.toMillis(8);
        System.out.println("Eight Hours in Millis using TimeUnit: " + eightHoursInMillisTimeUnit);
    }
}
