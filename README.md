#Berlin Clock Implementation

####Requirement
1. Implement the Berlin Clock as a function of the three parameters : hours (24-based), minutes, seconds and return a multi-line string. 
2. Find a reasonable representation for the colors and states. 
3. Provide instructions on how to run it.

####Description
The time is calculated by adding the lit rectangular lamps. 

The top lamp is a pump which is blinking on/off every two seconds. In the topmost line of red lamps every lamp represents 5 hours. 

In the second line of red lamps every lamp represents 1 hour. 

So if in the first line 2 lamps are lit and in the second line 3 lamps its 5+5+3=13h or 1 p.m. 

In the third line with tall lamps every lamp represents 5 minutes. 

There are 11 lamps, the 3rd, 6th, and 9th are red indicating the first quarter, half, and the last quarter of the hour. 

In the last line with yellow lamps every lamp represents 1 minute.
