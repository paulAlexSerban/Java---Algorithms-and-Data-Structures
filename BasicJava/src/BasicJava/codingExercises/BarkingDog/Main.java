package BasicJava.codingExercises.BarkingDog;

public class Main {
    public static void main(String[] args) {
        boolean isAwakeTest1 = BarkingDog.shouldWakeUp(true, 22);
        System.out.println(isAwakeTest1);

        boolean isAwakeTest2 = BarkingDog.shouldWakeUp(false, 23);
        System.out.println(isAwakeTest2);

        boolean isAwakeTest3 = BarkingDog.shouldWakeUp(false, 0);
        System.out.println(isAwakeTest3);

        boolean isAwakeTest4 = BarkingDog.shouldWakeUp(false, 8);
        System.out.println(isAwakeTest4);
    }
}
