package io.github.nazcompile.berlinclock;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class contains functionality to create a Berlin clock representation of any given time
 * @author Naz
 */
public class BerlinClock {
	
	private final Time time;
	
	private static final int HOUR_LAMP_COUNT = 4;
	private static final int TOP_MINS_LAMP_COUNT = 11;
	private static final int BOTTOM_MINS_LAMP_COUNT = 4;

	/**
	 * @param time
	 */
	public BerlinClock(Time time) {
		this.time = time;
	}
	
	/**
	 * Creates lamp representation for seconds
	 * @return String representation for whether the seconds lamp is on or off
	 */
	private String secondsLine() {
		return (time.getSeconds() % 2 == 0) ? Lamp.YELLOW : Lamp.OFF;
	}
	
	/**
	 * Creates lamp representation for top line of hours
	 * @return String representation for top line of hours
	 */
	private String topLineHour() {
		int litLamps = time.getHour() / 5;
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
	}
	
	/**
	 * Creates lamp representation for bottom line of hours
	 * @return String representation for bottom line of hours
	 */
	private String bottomLineHour() {
		int litLamps = time.getHour() % 5;
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
	}
	
	/**
	 * Creates lamp representation for top line of minutes
	 * @return String representation for top line of minutes
	 */
	private String topLineMinutes() {
		String result;
		int litLamps = time.getMinutes() / 5;
		
		result = createLampRepresentaion(litLamps, TOP_MINS_LAMP_COUNT, Lamp.YELLOW)
										.replaceAll("YYY", "YYR");
		return result;
	}
	
	/**
	 * Creates lamp representation for bottom line of minutes
	 * @return String representation for bottom line of minutes
	 */
	private String bottomLineMinutes() {
		int litLamps = time.getMinutes() % 5;
		return createLampRepresentaion(litLamps, BOTTOM_MINS_LAMP_COUNT, Lamp.YELLOW);
	}
	
	/**
	 * Creates lamp representation for a given line
	 * @param litLamps The number of lamps that are lit in a given line
	 * @param totalLamps The total number of lamps in a given line
	 * @param lampColour The colour of the lamps in a given line
	 * @return String containing lamp representation for a given line
	 */
	String createLampRepresentaion(int litLamps, int totalLamps, String lampColour) {
		String result;
		int unlitLamps = totalLamps - litLamps;
		
		result = Stream.of(Collections.nCopies(litLamps, lampColour), 
						   Collections.nCopies(unlitLamps, Lamp.OFF))
						.flatMap(Collection::stream)
						.collect(Collectors.joining());
		return result;
	}
	
	/**
	 * Draws the Berlin clock representation for a given time
	 * @return Berlin clock representation for a given time
	 */
	public String draw() {
		StringBuilder result = new StringBuilder();	
		result.append("      " + secondsLine()    + "\n");
		result.append("    "   + topLineHour()       + "\n");
		result.append("    "   + bottomLineHour()    + "\n");
		result.append(" " 	  + topLineMinutes()     + "\n");
		result.append("    "   + bottomLineMinutes());
		
		return result.toString();
	}
	
}