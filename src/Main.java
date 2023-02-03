import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");
        int wuerfel[] = new int[2];
        boolean isPasch = false;

        for (int i = 0; i < 3 && !isPasch; i++) {
            while (!isPasch) {
                int raus = zufallszahlGenerator.generiereZufallszahl(System.currentTimeMillis());
                //System.out.println(raus);
                //Würfel 1
                wuerfel[0] = (raus % 6) + 1;
                System.out.println("Wuerfel 1: " + wuerfel[0]);
                //Würfel 2
                wuerfel[1] = (int) ((Math.random() * Integer.MAX_VALUE) % 6) + 1;
                System.out.println("Wuerfel 2: " + wuerfel[1]);
                //1 Sekunde warten 4 better readability
                TimeUnit.MILLISECONDS.sleep(500);
                //Pasch überprüfen
                if (wuerfel[0] == wuerfel[1]) {
                    isPasch = true;
                    System.out.println("Pasch!");
                }
            }
        }
    }
}