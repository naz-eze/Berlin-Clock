package io.github.nazcompile.berlinclock

import spock.lang.Specification

class MainSpec extends Specification {
	
	def cleanupSpec() {
		System.setOut(null)
	}
	
	def "Should throw exception if an invalid number of arguments is used"() {
		when:
			Main.validateArgs(args)
		then:
			thrown IllegalArgumentException
		where:
			args << [['13:23:14', '12:00:42'] as String[], [] as String[]]
	}
	
	def "Should print the berlin clock representation if input args and time are valid"() {
		given:
			def outStream = new ByteArrayOutputStream()
			System.setOut(new PrintStream(outStream))
			String[] args = ['7:11:13']
		when:
			Main.main(args)
		then:
			expected == outStream.toString()
		where:
			expected =  "      O\n" +
						"    ROOO\n" +
						"    RROO\n" +
						" YYOOOOOOOOO\n" +
						"    YOOO\n"
	}

}
