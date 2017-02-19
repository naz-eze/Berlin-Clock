package io.github.nazcompile.berlinclock;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BerlinClock {
	
	private final Time time;
	
	private static final int HOUR_LAMP_COUNT = 4;	
		
	public BerlinClock(Time time) {
		this.time = time;
	}
	
	String getSecondsLamp() {
		return (time.getSeconds() % 2 == 0) ? Lamp.YELLOW : Lamp.OFF;
	}
	
	String topLineHour() {
		int litLamps = time.getHour() / 5;
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
	}
	
	String bottomLineHour() {
		int litLamps = time.getHour() % 5;		//could potentially use a class here?
		return createLampRepresentaion(litLamps, HOUR_LAMP_COUNT, Lamp.RED);
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
	
}