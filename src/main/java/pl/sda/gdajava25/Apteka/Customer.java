package pl.sda.gdajava25.Apteka;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private int wiek;
    private boolean brzuchata;
    private String imie;
}
