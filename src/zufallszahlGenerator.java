import java.lang.Math;;
public class zufallszahlGenerator {
    private static int shortPlaceHolder = 0;
    public static int generiereZufallszahl(long samen) {
        long xK = systemZeit.getSystemZeit();
        int a = 16807;
        double m = Math.pow(2, 31) - 1;
        //samen = (a * samen) % m;
        double xK1 = (a * xK) % m;
        //long ausgabe = (int) (samen % 100);
        return (int) xK1;
    }

}
