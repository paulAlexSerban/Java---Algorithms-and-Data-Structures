package BasicJava.codingExercies.MegaBytesConverter;

public class MegaByteConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if(kiloBytes < 0){
            System.out.println("Invalid Value");

        } else {
            int megaByte = (int) (kiloBytes / 1024);
            int remainder = (int) (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");

        }
    }
}
