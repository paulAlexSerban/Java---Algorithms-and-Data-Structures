# MegaByte Converter

## SP 1
1. Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
    * 1.1 The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
    * 1.2 Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
    * 1.3 XX represents the original value kiloBytes.
    * 1.4 YY represents the calculated megabytes.
    * 1.5 ZZ represents the calculated remaining kilobytes.
    * For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB".
    * If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
    
    ### Examples of input/output
    * `printMegaBytesAndKiloBytes(2500);` → should print the following text: "2500 KB = 2 MB and 452 KB"
    * `printMegaBytesAndKiloBytes(-1024);` → should print the following text: "Invalid Value" because parameter is less than 0.
    * `printMegaBytesAndKiloBytes(5000);` → should print the following text: "5000 KB = 4 MB and 904 KB"

## Tips
TIP: Be extremely careful about spaces in the printed message.
TIP: Use the remainder operator
TIP: 1 MB = 1024 KB

## Notes
NOTE: Do not set kilobytes parameter value inside your method.
NOTE: The solution will not be accepted if there are extra spaces.
NOTE: The printMegaBytesAndKiloBytes method  needs to be defined as public static like we have been doing so far in the course.NOTE: Do not add a  main method to solution code.