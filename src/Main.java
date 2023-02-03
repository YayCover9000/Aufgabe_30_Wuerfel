public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");
        for(int i = 0; i < 10; i++) {
            int raus = zufallszahlGenerator.generiereZufallszahl(System.currentTimeMillis());
            //System.out.println(raus);
            int wuerfel[] = new int[2];
            wuerfel[0] = (raus % 6) + 1;
            System.out.println(wuerfel[0]);
            java.util.concurrent.TimeUnit.SECONDS.sleep(1);
        }

    }

}