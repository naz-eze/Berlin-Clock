package io.github.nazcompile.berlinclock;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BerlinClock {
	
	private final Time time;
	
	private static final int HOUR_LAMP_COUNT = 4;
	private static final int TOP_MINS_LAMP_COUNT = 11;
	private static final int BOTTOM_MINS_LAMP_COUNT = 4;

	public BerlinClock(Time time) {
		this.time = time;
	}
	
	private String getSecondsLamp() {
		return (time.getSeconds() % 2 == 0) ? Lamp.YELLOW : Lamp.OFF;
	}
	
	private String topLineHour() {
		int litLamps = time.getHour() / 5;
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
	}
	
	private String bottomLineHour() {
		int litLamps = time.getHour() % 5;
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
	}
	
	private String topLineMinutes() {
		String result;
		int litLamps = time.getMinutes() / 5;
		
		result = createLampRepresentaion(litLamps, TOP_MINS_LAMP_COUNT, Lamp.YELLOW)
										.replaceAll("YYY", "YYR");
		return result;
	}
	
	private String bottomLineMinutes() {
		int litLamps = time.getMinutes() % 5;
		return createLampRepresentaion(litLamps, BOTTOM_MINS_LAMP_COUNT, Lamp.YELLOW);
	}
	
	private String createLampRepresentaion(int litLamps, int totalLamps, String lampColour) {
		String result;
		int unlitLamps = totalLamps - litLamps;
		
		result = Stream.of(Collections.nCopies(litLamps, lampColour), 
						   Collections.nCopies(unlitLamps, Lamp.OFF))
						.flatMap(Collection::stream)
						.collect(Collectors.joining());
		return result;
	}
	
	public String convert() {
		StringBuilder result = new StringBuilder();
		result.append("      " + getSecondsLamp()    + "\n");
		result.append("    "   + topLineHour()       + "\n");
		result.append("    "   + bottomLineHour()    + "\n");
		result.append(" " 	  + topLineMinutes()     + "\n");
		result.append("    "   + bottomLineMinutes());
		
		return result.toString();
	}
	
}