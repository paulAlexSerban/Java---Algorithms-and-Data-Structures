package BasicJava.DataTypes;

public class DataTypes {

    public static void main(String[] args) {
        /**
         * Integer
         * it is whole number
         * it has a MIN_VALUE and a MAX_VALUE to store numbers
         */
        int firstInteger = 1000;
        int minimumInteger = Integer.MIN_VALUE; // -2147483648
        int maximumInteger = Integer.MAX_VALUE; // 2147483647

        System.out.println("minimumInteger " + minimumInteger);
        System.out.println("maximumInteger " + maximumInteger);

        System.out.println("Busted MIN_VALUE " + (minimumInteger - 1) );
        System.out.println("Busted MAX_VALUE " + (maximumInteger + 1) );

        /**
         * Byte
         * is is a very small whole number
         */
        byte minimumByte = Byte.MIN_VALUE;
        byte maximumByte = Byte.MAX_VALUE;
        System.out.println("minimum byte value " + minimumByte);
        System.out.println("maximum byte value " + maximumByte);

        /**
         * Short
         * is a medium whole number
         */
        short minimumShort = Short.MIN_VALUE;
        short maximumShort = Short.MAX_VALUE;
        System.out.println("minimum short value " + minimumShort);
        System.out.println("maximum short value " + maximumShort);

        /**
         * Long
         *
         * long values need a L at the end of the number to tell the compiler it is a long value
         */
        long firstLong = 100L;
        long minimumLong = Long.MIN_VALUE;
        long maximumLong = Long.MAX_VALUE;
        System.out.println("Minimum long value " + minimumLong);
        System.out.println("Maximum long value " + maximumLong);

        /**
         * Casting in Java
         * it means to convert a number from one type to another
         * Eg. (byte)(minimumByte / 2)
         */

        System.out.println("casting byte example " + (byte)(minimumByte / 2));
        System.out.println("casting short example" + (short)(minimumShort / 2));

        short shortTotal = (short)(1000 + 10 * (minimumByte + maximumInteger));
        System.out.println("casted short total" + shortTotal);

        /**
         * Floating Point Numbers
         * - have fractional parts that we express with a decimal point
         * Eg. 3.1415
         * - we use floating point numbers when we need more precision in calculations
         */


        /**
         * Single and Double Precision
         * - precision refers to the format and amount of space occupied by the type
         * - Single precision occupies 32 bits
         * - Double precision occupies 64 bits
         */

        float minimumFloat = Float.MIN_VALUE;
        float maximumFlaot = Float.MAX_VALUE;
        System.out.println("Minimum float number " +  minimumFloat);
        System.out.println("Maximum float number " + maximumFlaot);

        double minimumDouble = Double.MIN_VALUE;
        double maximumDouble = Double.MAX_VALUE;
        System.out.println("Minimum double number " +  minimumDouble);
        System.out.println("Maximum double number " + maximumDouble);

        int intValue = 5;
        float floatValue = 5.25f;
        double doubleValue = 5.35d;

        /**
         * Floating Point Number Precision Tips
         * - float and double are great for general floating point operations, but both are not great where precise
         * calculations are required - this is due to a limitation with how floating point numbers a re stored,
         * and not a Java problem as such
         *
         * - Java has a class called BigDeciaml that overcomes this
         * - to keep in mind that when precise calculations are necessary, such as when currency calculations,
         * floating-point types should not be used
         */

        /**
         * Char
         * - similar to a string but it can only store a single character
         * - it occupies two bytes of memory, or 16 bits
         * - it is not a single byte because ut allows to store Unicode characters
         */
	    char firstChar = 'D';
	    char unicodeChar = '\u0044';

        /**
         * Boolean
         * - allows two choices True or False, Yes or No, 1 or 0
         */
        boolean trueBooleanValue = true;
        boolean falseBooleanvalue = false;

        /**
         * String
         * - a datatype which is not a primitive type it is a Class
         * - a String is a sequence of characters
         * - technically a String is limited by memory of the MAX_VALUE of an Integer
         *
         * ! Strings in Java are IMMUTABLE
         */

        String firstString = "This is a string";
    }
}
