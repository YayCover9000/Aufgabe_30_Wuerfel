public class zufallszahlGenerator {
    private static int shortPlaceHolder = 0;
    public static int generiereZufallszahl(long samen) {
        int xK = 213;
        int a = 16807;
        int m = 2^3;
        //samen = (a * samen) % m;
        int xK1 = (a * xK) % m;
        long ausgabe = (int) (samen % 100);
        return (int) ausgabe;
    }

}
