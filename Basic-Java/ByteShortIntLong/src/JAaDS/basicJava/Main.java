package JAaDS.basicJava;

public class Main {

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
    }
}
