package pl.sda.gdajava25.Priorytet;

import lombok.Data;

import java.time.LocalTime;

@Data
public class Klient {
    private String imie;
    private LocalTime czasPrzybyciaDoKolejki;
    private boolean czyJestPriorytetem;

    public Klient(String imie, boolean czyJestPriorytetem) {
        this.imie = imie;
        this.czasPrzybyciaDoKolejki = LocalTime.now();
        this.czyJestPriorytetem = czyJestPriorytetem;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", czasPrzybyciaDoKolejki=" + czasPrzybyciaDoKolejki +
                ", czyJestPriorytetem=" + czyJestPriorytetem +
                '}';
    }
}
