package pl.sda.gdajava25.Wakacje_z_dziećmi;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService pula = Executors.newCachedThreadPool();
        Child[] childrens = new Child[5];

        for (int i = 0; i < childrens.length; i++) {
            childrens[i] = new Child();
            pula.submit(childrens[i]);
        }
        int stoppedChildren = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            String linia = scanner.nextLine();
            if (linia.equalsIgnoreCase("stop")) {
                childrens[stoppedChildren++].dojechalismy();
                System.out.println("Zatrymuje " + (stoppedChildren - 1));
            }else {
                System.out.println("buka: " + linia);
            }
        } while (stoppedChildren < childrens.length);

        try {
            pula.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
