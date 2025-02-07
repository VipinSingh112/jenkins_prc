package com.nbp.fire.brigade.dashboard.web.portlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversionUtil {
	public static void timeConversion(String timeRange) {
        try {
            String convertedTimeRange = convertTo24HourFormat(timeRange);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static String convertTo24HourFormat(String timeRange) throws ParseException {
        String[] times = timeRange.split(" - ");
        if (times.length != 2) {
            throw new IllegalArgumentException("Invalid time range format");
        }

        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");

        Date startTime = inputFormat.parse(times[0]);
        Date endTime = inputFormat.parse(times[1]);

        String startTime24 = outputFormat.format(startTime);
        String endTime24 = outputFormat.format(endTime);

        return startTime24;
    }
}
