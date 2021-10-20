package BasicJava.codingExercises.BarkingDog;

public class BarkingDog {
    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0  || hourOfDay > 23) {
            return false;
        }

        if (((hourOfDay < 8 && hourOfDay >= 0  ) || (hourOfDay > 22 && hourOfDay <= 23)) && isBarking == true) {
            return true;
        } else {
            return false;
        }
    }
}
