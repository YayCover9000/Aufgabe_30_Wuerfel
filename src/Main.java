public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int raus = zufallszahlGenerator.generiereZufallszahl(1);
        //System.out.println(raus);
        int wuerfel[] = new int[2];
        wuerfel[1] = (raus % 6) + 1;
        while (true){
            System.out.println("Würfel 1: " + wuerfel[0]);
            System.out.println("Würfel 2: " + wuerfel[1]);
            if (wuerfel[0] == wuerfel[1]){
                System.out.println("Pasch!");
                break;
            }
            wuerfel[0] = wuerfel[1];
            raus = zufallszahlGenerator.generiereZufallszahl(1);
            wuerfel[1] = (raus % 6) + 1;
        }
        System.out.println(wuerfel[1]);
    }

}