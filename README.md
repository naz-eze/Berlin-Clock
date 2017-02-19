Berlin Clock Implementation
================================

Implement the Berlin Clock as a function of the three parameters : hours (24-based), minutes, seconds and return a multi-line string. 
The time is calculated by adding the lit rectangular lamps. 

-----------------------------------------------------------------------

####Description

* The first line consist of **1** yellow circular lamp that blinks on/off every two seconds. 
* The next line consist of **4** red rectangular lamps, and every lamp represents 5 hours.
* The next line consist of **4** red rectangular lamps, and every lamp represents 1 hour.
* The next line consist of **11** rectangular lamps, and every lamp represents 5 minutes. The 3rd, 6th, and 9th are red indicating the first quarter, half, and the last quarter of the hour, while the rest are yellow. 
* The last line consist of **4** yellow lamps, and every lamp represents 1 minute.

For colour representation in this application, assume the following:
* Yellow Lamps are represented by **'Y'** when **On** 
* Red Lamps are represented by **'R'** when **On** 
* Both Yellow and Red Lamps are represented by **'O'** when **Off** 

-----------------------------------------------------------------------

####Requirements needed to build and run the application

* You will need at least JDK 1.8. This can be found on [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
* Please ensure your JAVA_HOME environment variable is set your JDK1.8 download directory.

--------------------------------------------------------------------------------

####How To Build

* Open a Terminal window or Command Prompt window

* Change Directory to 'Project_Folder'.

>	This should contain 
		- .project
	    - build.gradle	
        - gradle/
        - gradlew.sh
        - gradlew.bat
        - README.md
        - src/
        
*  For *nix OS run the command - ./gradlew clean build
   For Windows OS run the command - gradlew.bat clean build
   
> This might take a few minutes the first time it runs as it needs to download the dependencies it needs 		to 	build the code. The dependencies can be found in the build.gradle file inside dependencies { }
		
* A new 'build' directory is created in 'Project_Folder' containing all the build output

--------------------------------------------------------------------------------

####How To Run

* Change directory to the newly created 'Project_Folder'/build/distributions 

* Unpack any of the ExpediaCodeTest-1.0.zip or ExpediaCodeTest-1.0.tar files

* Change directory to the unpacked directory ('Project_Folder'/build/distributions/ExpediaCodeTest-1.0)

> This should contain 	
	- bin/ 
	- lib/
        
* Run the program

		The time should be entered in this format: 'HH:mm:ss'
		
		For *nix OS run the command - bin/ExpediaCodeTest '24H_TIME'
		For Windows OS run the command - bin\ExpediaCodeTest.bat '24H_TIME'
		
		Example run - ./bin/ExpediaCodeTest '14:35:49'

--------------------------------------------------------------------------------

####Generated Documents
This documents will be generated as part of the build process

* Java Documentation - 'Project_Folder'/build/docs/javadoc/index.html

* Unit Tests Code Coverage Report - 'Project_Folder'/build/reports/jacoco/test/html/index.html

* Unit Tests Report - 'Project_Folder'/build/reports/tests/index.html