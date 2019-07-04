package pl.sda.gdajava25.Priorytet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Poczekalnia poczekalnia = new Poczekalnia();

        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;
        do {
            String linia = scanner.nextLine();

            if (linia.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj imie klienta:");
                String imie = scanner.nextLine();
                System.out.println("Czy ma priorytet?");
                String czyPriorytet = scanner.nextLine();

                boolean priorytet = czyPriorytet.equalsIgnoreCase("t") || czyPriorytet.equalsIgnoreCase("tak") || czyPriorytet.equalsIgnoreCase("yes") || czyPriorytet.equalsIgnoreCase("y");

                poczekalnia.dodajKlienta(imie, priorytet);
            } else if (linia.equalsIgnoreCase("pobierz")) {
                try {
                    Klient k = poczekalnia.pobierzKlienta();
                    System.out.println(k);
                }catch (QuqueIsEmptyException re){
                    System.out.println(re.getMessage());
                }

            } else if (linia.equalsIgnoreCase("wypisz")) {
                poczekalnia.wypiszKolejnoKlientow();
            }

        } while (isWorking);

    }
}
