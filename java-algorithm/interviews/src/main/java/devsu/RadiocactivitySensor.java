package devsu;

/*
Your company builds radioactivity sensors. You are responsible of their verification process. You know that when a sensor is failing, the value it outputs have big variatons on short time periods.

The input parameter values, a list of decimal numbers, contains the radioactivity measured by the sensor every second. The unit is arbitrary.

You want to count the quantity of "peaks" in these values, which would help you determine if the sensor fails.
When a value is at least 5 units higher than its two neighbors, it's a "top peak".
When a value is at least 5 units lower than its two neighbors, it's a "bottom peak".
You must return an integer: the total number of top peaks and bottom peaks.
The first and last elements of the list values can never be peaks.

values is always defined (it is never null, None, etc.). It contains between 0 and 20 values.

The radioactivity values are between 0 and 100.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadiocactivitySensor {

    public static int countPeaks(List<Double> values) {
        int peakCount = 0;

        for (int i = 1; i < values.size() - 1; i++){
            if (values.get(i).equals(values.get(i - 1))) continue;
            if (values.get(i).equals(values.get(i + 1))) continue;

            double current = values.get(i);
            double left = values.get(i - 1);
            double rigth = values.get(i + 1);

            if (current >= left + 5 && current >= rigth + 5) {
                peakCount++;
            } else if (current <= left - 5 && current <= rigth - 5) {
                peakCount++;
            }

        }

        return peakCount;
    }

    public static void main (String [] args){
        List<Double> values = new ArrayList<>(Arrays.asList(8.0, 10.7, 17.1, 11.2, 13.5, 9.9, 14.9, 9.4, 9.4, 3.1, 12.7));
        System.out.println(countPeaks(values));
    }

}
