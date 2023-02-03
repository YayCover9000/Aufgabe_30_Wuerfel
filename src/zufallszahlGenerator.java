import java.lang.Math;;
public class zufallszahlGenerator {
    private static int shortPlaceHolder = 0;
    public static int generiereZufallszahl(long samen) {
        long xK = systemZeit.getSystemZeit(); //System.currentTimeMillis();
        int a = 16807;
        double m = Math.pow(2, 31) - 1;
        double xK1 = (a * xK) % m;
        return (int) xK1;
    }

}
