package io.github.nazcompile.berlinclock

import spock.lang.Specification

class BerlinClockSpec extends Specification {

	def "Should return correct lamp representation for seconds"() {
		given:
			Time time = new Time()
			time.seconds = seconds
			def berlinClock = new BerlinClock(time)
			
		when:
			def result = berlinClock.getSecondsLamp()
		then:
			expected == result
		where:
			seconds		|	expected
			22			|	Lamp.YELLOW
			23			|	Lamp.OFF
			54			|	Lamp.YELLOW
			17			|	Lamp.OFF		
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
	
}
