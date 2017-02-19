package io.github.nazcompile.berlinclock

import spock.lang.Specification;

class LampSpec extends Specification {
	
	def "Should return correct value for lamp states"() {
		expect:
			Lamp.OFF == 'O'
			Lamp.RED == 'R'
			Lamp.YELLOW == 'Y'
	}

}
