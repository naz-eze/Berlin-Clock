package io.github.nazcompile.berlinclock

import spock.lang.Specification

class BerlinClockSpec extends Specification {

	def "Should return correct lamp representation for seconds"() {
		given:
			Time time = new Time()
			time.seconds = seconds
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.secondsLine()
		then:
			expected == result
		where:
			seconds		|	expected
			22			|	'Y'
			23			|	'O'
			54			|	'Y'
			17			|	'O'		
	}
	
	def "Should return correct lamp representation for hours on the top hour line"() {
		given:
			Time time = new Time()
			time.hour = hour
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.topLineHour()
		then:
			expected == result
		where:
			hour		|	expected
			13			|	'RROO'
			3			|	'OOOO'
			21			|	'RRRR'
			15			|	'RRRO'
	}
	
	def "Should return correct lamp representation for hours on the bottom hour line"() {
		given:
			Time time = new Time()
			time.hour = hour
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.bottomLineHour()
		then:
			expected == result
		where:
			hour		|	expected
			13			|	'RRRO'
			3			|	'RRRO'
			21			|	'ROOO'
			15			|	'OOOO'
	}
	
	def "Should return correct lamp representation for minutes on the top minutes line"() {
		given:
			Time time = new Time()
			time.minutes = minutes
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.topLineMinutes()
		then:
			expected == result
		where:
			minutes		|	expected
			30			|	'YYRYYROOOOO'
			54			|	'YYRYYRYYRYO'
			23			|	'YYRYOOOOOOO'
			15			|	'YYROOOOOOOO'
	}
	
	def "Should return correct lamp representation for minutes on the bottom minutes line"() {
		given:
			Time time = new Time()
			time.minutes = minutes
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.bottomLineMinutes()
		then:
			expected == result
		where:
			minutes		|	expected
			30			|	'OOOO'
			54			|	'YYYY'
			23			|	'YYYO'
			15			|	'OOOO'
	}
	
	def "Should be able to draw a correct berlin clock representation of a given time"() {
		given:
			def berlinClock = new BerlinClock(Time.parseTime('13:32:54'))
		when:
			def result = berlinClock.draw();
		then:
			result == expected
		where:
			expected =  "      Y\n" +
						"    RROO\n" +
						"    RRRO\n" +
						" YYRYYROOOOO\n" +
						"    YYOO"
	}
	
}
