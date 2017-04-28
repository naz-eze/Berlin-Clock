package io.github.nazcompile.berlinclock

import spock.lang.Specification;

class TimeSpec extends Specification {
	
	def "Should be able to correctly parse a valid input time"() {
		when:
			Time time = Time.parseTime(timeValue)
			
		then:
			expectedHour == time.getHour()
			expectedMins == time.getMinutes()
			expectedSecs == time.getSeconds()
			
		where:
			timeValue	|	expectedHour	|	expectedMins	|	expectedSecs
			'13:27:45'	|		13	|		27	|		45
			'02:15:36'	|		2	|		15	|		36
			'23:30:03'	|		23	|		30	|		3
			'00:00:14'	|		0	|		0	|		14
	}
	
	def "Should throw an Illegal argument exception if an invalid time is provided"() {
		when:
			Time.parseTime(invalidTime)
		then:
			thrown IllegalArgumentException
		where:
			invalidTime << ['24:02:13', '12:30pm']
	}

}
