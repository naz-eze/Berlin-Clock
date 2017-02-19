package io.github.nazcompile.berlinclock;

public class Main {

	public static void main(String[] args) {
		validateArgs(args);
		
		BerlinClock berlinClock = new BerlinClock(Time.parseTime(args[0]));
		System.out.println(berlinClock.draw());
	}
	
	private static void validateArgs(String[] args) {
		if (args.length != 1) {
			throw new IllegalArgumentException("Invalid number of arguments supplied. Total args - " 
												+ args.length);
		}
	}

}
