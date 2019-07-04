package pl.sda.gdajava25.Priorytet;


import java.util.PriorityQueue;

public class Poczekalnia {
    private PriorityQueue<Klient> klientPriorityQueue = new PriorityQueue<>(
            (o1, o2) -> {
                if (o1.isCzyJestPriorytetem() && !o2.isCzyJestPriorytetem())
                    return -1;
                else if (!o1.isCzyJestPriorytetem() && o2.isCzyJestPriorytetem())
                    return 1;
                if (o1.getCzasPrzybyciaDoKolejki().isAfter(o2.getCzasPrzybyciaDoKolejki())) {
                    return 1;
                }
                if (o2.getCzasPrzybyciaDoKolejki().isAfter(o1.getCzasPrzybyciaDoKolejki())) {
                    return -1;
                }
                return 0;
            }
    );

    public void dodajKlienta(String imie, boolean czyJestPriorytetem) {
        klientPriorityQueue.add(new Klient(imie, czyJestPriorytetem));
    }

    public Klient pobierzKlienta() {
        if (klientPriorityQueue.isEmpty()) {
            throw new QuqueIsEmptyException(":(");
        }
        return klientPriorityQueue.poll();
    }

    public void wypiszKolejnoKlientow() {
        PriorityQueue<Klient> klients = klientPriorityQueue;
        while (!klients.isEmpty()) {
            System.out.println(klients.poll());
        }
    }
}

