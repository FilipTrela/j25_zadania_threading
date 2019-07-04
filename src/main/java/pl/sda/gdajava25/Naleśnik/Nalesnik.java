package pl.sda.gdajava25.Naleśnik;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Nalesnik {
    private List<String> listaSkladnikow;
    private LocalDateTime czasStworzenia;

    public Nalesnik(List<String> listaSkladnikow) {
        this.listaSkladnikow = listaSkladnikow;
        this.czasStworzenia = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Nalesnik " + listaSkladnikow +
                ", leżał " + Duration.between(czasStworzenia, LocalDateTime.now()).getSeconds() +
                " sekund.";
    }
}
