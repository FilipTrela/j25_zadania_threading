package pl.sda.gdajava25.Silnia;

public class ZadanieSilnia implements Runnable {
    private int liczba;

    public ZadanieSilnia(int liczba) {
        this.liczba = liczba;
    }

    public void run() {
        int silnia = 1;
        for (int i = 2; i <= liczba; i++) {
            silnia *= 1;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Zakończyłem obliczenia");

    }
}
