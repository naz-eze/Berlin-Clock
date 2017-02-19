package io.github.nazcompile.berlinclock;

/**
 * This class contains the main method which is the application entry point.
 * @author Naz
 */
public class Application {

	/**
	 * Main method which runs the application
	 * @param args the command line argument
	 */
	public static void main(String[] args) {
		validateArgs(args);
		
		BerlinClock berlinClock = new BerlinClock(Time.parseTime(args[0]));
		System.out.println(berlinClock.draw());
	}
	
	/**
	 * Validates the number of command line arguments
	 * @param args the command line argument
	 * @throws IllegalArgumentException when wrong number of arguments is used
	 */
	private static void validateArgs(String[] args) {
		if (args.length != 1) {
			throw new IllegalArgumentException("Invalid number of arguments supplied. Total args - " 
												+ args.length);
		}
	}

}
