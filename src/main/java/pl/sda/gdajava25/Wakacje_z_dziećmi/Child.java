package pl.sda.gdajava25.Wakacje_z_dziećmi;

import java.util.Random;

public class Child implements Runnable {
    private static final String[] krzycz = {
            "Czy to już",
            "Daleko jeszcze?",
            "Dojechaliśmy?",
            "Mamo kiedy będziemy?",
            "Jest mi nie dobrze!"};
    private boolean czyDojechaliśmy = false;

    public void run() {
        do {
            int los = new Random().nextInt(5);
            System.out.println(krzycz[los]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (czyDojechaliśmy);
    }

    public void dojechalismy() {
        czyDojechaliśmy = true;
    }

}
