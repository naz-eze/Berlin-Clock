package io.github.nazcompile.berlinclock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
		
	private int hour;
	private int minutes;
	private int seconds;
	
	private Time() { }

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
	public static Time parseTime(String timeString) {
		Time time = new Time();
		String timePattern = "HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(timePattern);
		sdf.setLenient(false); 
		
		try {			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(sdf.parse(timeString));
			
			time.hour = calendar.get(Calendar.HOUR_OF_DAY);
			time.minutes = calendar.get(Calendar.MINUTE);
			time.seconds = calendar.get(Calendar.SECOND);

		} catch (ParseException e) {
			//log e
			throw new IllegalArgumentException("Invalid time provided. Cause - " + e.getMessage());
		}
		
		return time;
	}

}
