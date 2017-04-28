Berlin Clock Implementation
================================

Implement the Berlin Clock as a function of the three parameters : hours (24-based), minutes, seconds and return a multi-line string. 
The time is calculated by adding the lit rectangular lamps. 
* The first line consist of **1** yellow circular lamp that blinks on/off every two seconds. 
* The next line consist of **4** red rectangular lamps, and every lamp represents 5 hours.
* The next line consist of **4** red rectangular lamps, and every lamp represents 1 hour.
* The next line consist of **11** rectangular lamps, and every lamp represents 5 minutes. The 3rd, 6th, and 9th are red indicating the first quarter, half, and the last quarter of the hour, while the rest are yellow. 
* The last line consist of **4** yellow lamps, and every lamp represents 1 minute.

For colour representation in this application, assume the following:
* Yellow Lamps are represented by **'Y'** when **On** 
* Red Lamps are represented by **'R'** when **On** 
* Both Yellow and Red Lamps are represented by **'O'** when **Off** 

# Prerequisites

* JDK 8 and JAVA_HOME environment variable set 

# Building the project

Clone the repository:
> git clone https://github.com/nazcompile/Berlin-Clock

Navigate to the newly created folder:
> cd Berlin-Clock

Run the project:
> * For *nix OS run the command - ./gradlew clean build
> * For Windows OS run the command - gradlew.bat clean build

> This might take a few minutes the first time it runs as it needs to download the dependencies it needs to build the code. The dependencies can be found in the build.gradle file inside dependencies { }
		
# Running the application

* Change directory to the newly created Berlin-Clock/build/distributions 

* Unpack any of the Berlin-Clock-1.0.zip or Berlin-Clock-1.0.tar files

* Change directory to the unpacked directory (Berlin-Clock/build/distributions/Berlin-Clock-1.0)
> This should contain 	
> 	- bin/ 
>	- lib/
        
* Run the program
> For *nix OS run the command - bin/Berlin-Clock '24H_TIME'
> For Windows OS run the command - bin\Berlin-Clock.bat '24H_TIME'

> The 24H_TIME should be entered in this format: 'HH:mm:ss' 
> Example - bin/Berlin-Clock '14:35:49'


# Generated Documents

These documents will be generated as part of the build process

* Java Documentation - Berlin-Clock/build/docs/javadoc/index.html

* Unit Tests Code Coverage Report - Berlin-Clock/build/reports/jacoco/test/html/index.html

* Unit Tests Report - Berlin-Clock/build/reports/tests/index.html
