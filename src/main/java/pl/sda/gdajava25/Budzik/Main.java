package pl.sda.gdajava25.Budzik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread();
        String komenda;
        do {
            System.out.println("Co teraz?");
            komenda = scanner.nextLine();
            if(komenda.equalsIgnoreCase("teraz")){
                try {
                    Thread.sleep(25000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } while (!komenda.equalsIgnoreCase("quit"));
    }
}
