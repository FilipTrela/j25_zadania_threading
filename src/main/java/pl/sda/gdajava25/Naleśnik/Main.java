package pl.sda.gdajava25.Naleśnik;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nalesnikarnia nalesnikarnia = new Nalesnikarnia();

        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;
        do {
            String linia = scanner.nextLine();

            if (linia.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj składniki. Każde nowe słowo oddzielone spacją będzie nowym składnikiem:");
                String[] skladniki = scanner.nextLine().split(" ");

                nalesnikarnia.stworzNalesnika(Arrays.asList(skladniki));
            } else if (linia.equalsIgnoreCase("pobierz")) {
                try {
                    Nalesnik nalesnik = nalesnikarnia.pobierzNalesnikaZeStosu();

                    System.out.println("Pobrałeś: " + nalesnik);

                    // jeśli naleśnik ma więcej niż 10 min, to jest zimny
                    if (Duration.between(nalesnik.getCzasStworzenia(), LocalDateTime.now()).getSeconds() > 600) {
                        System.out.println("Zimny :(");
                    }
                } catch (NieMaNalesnikowException npe) {
                    System.err.println("Głodujemy :(");
                }
            } else if (linia.equalsIgnoreCase("quit")) {
                break;
            }

        } while (isWorking);

    }
}
