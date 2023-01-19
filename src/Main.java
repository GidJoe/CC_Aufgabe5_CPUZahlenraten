import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myscan = new Scanner(System.in);

        int eingabe, max = 100, min = 1, rngcpu;
        String gok;
        Random rng = new Random();
        boolean schleife = true;

        System.out.println(" Der Computer errät deine Zahl");
        System.out.println(" ...bitte Zahl eingeben");
        eingabe = myscan.nextInt();

        label:

        while (true) {
            rngcpu = rng.nextInt(min, max);

            System.out.println("Zahl vom Computer: " + rngcpu);
            System.out.println("Die gesuchte Zahl lautet: " + eingabe);
            System.out.println("____________________________________");
            System.out.println("(k)leiner (g)rößer (o) Treffer");

            gok = myscan.next();

            if (gok.equals("o") && rngcpu == eingabe) {
                System.out.println("Der Computer hat die Zahl erraten");
                break;
            } else if (gok.equals("k") && rngcpu > eingabe) {
                max = rngcpu;
            } else if (gok.equals("g") && rngcpu < eingabe) {
                min = rngcpu;
            } else {
                System.out.println("Falsche Eingabe. Nochmal");
                System.out.println("");
            }

        }
    }
}

