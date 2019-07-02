package pl.sda.gdajava25.Silnia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        ZadanieSilnia[] zadanieSilnias = new ZadanieSilnia[5];
        while (counter <= 5){
            System.out.println("Podaj liczbę");
            zadanieSilnias[counter] = new ZadanieSilnia(Integer.parseInt(scanner.nextLine()));
            threads[counter] = new Thread(zadanieSilnias[counter]);
            counter++;
        }



    }
}
