Rules

The input data you require for your program is provided in text format.
This data is comprised of lines, each of which represents a defibrillator. Each defibrillator is represented by the following fields:
A number identifying the defibrillator
Name
Address
Contact Phone number
Longitude (degrees)
Latitude (degrees)

The program will display the name of the defibrillator located the closest to the user’s position. This position is given as input to the program.

Input
Line 1: User's longitude (in degrees)
Line 2: User's latitude (in degrees)
Line 3: The number N of defibrillators located in the streets of Montpellier
N next lines: a description of each defibrillator

Output
The name of the defibrillator located the closest to the user’s position.

Constraints
0 < N < 10000
