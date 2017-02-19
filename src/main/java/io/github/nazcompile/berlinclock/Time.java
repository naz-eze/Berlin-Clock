package io.github.nazcompile.berlinclock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This class contains functionality to parse and retrieve time information
 * @author Naz
 */
public class Time {
		
	private int hour;
	private int minutes;
	private int seconds;
	
	private Time() { }

	/**
	 * Returns the hour value
	 * @return the hour value
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Returns the minutes value
	 * @return the minutes value
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * Returns the seconds value
	 * @return the seconds value
	 */
	public int getSeconds() {
		return seconds;
	}
	
	/**
	 * Parses the time from string format and returns it as a Time object
	 * @param timeString time in String format
	 * @return time object containing parsed time information
	 * @throws IllegalArgumentException when an invalid time is supplied
	 */
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
