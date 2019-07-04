package pl.sda.gdajava25.Naleśnik;


import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Nalesnikarnia {
    // pula wątków reprezentuje 3 pracowników
    private ExecutorService executorService = Executors.newFixedThreadPool(3);
    private NalesnikCreator[] creators;

    private Stack<Nalesnik> nalesniks = new Stack<>();

    public Nalesnikarnia() {
        creators = new NalesnikCreator[3];
        // wypełniamy
        for (int i = 0; i < 3; i++) {
            creators[i] = new NalesnikCreator(this);
            executorService.submit(creators[i]);
        }
    }

    public void stworzNalesnika(List<String> asList) {
        System.out.println("Tworzymy nowy naleśnik.");
        nalesniks.push(new Nalesnik(asList));
    }

    public Nalesnik pobierzNalesnikaZeStosu() {
        if (nalesniks.empty()) {
            throw new NieMaNalesnikowException(":((");
        }
        Nalesnik zabrany = nalesniks.pop();
        return zabrany;
    }

    public int pobierzIloscGotowychNalesnikow() {
        return nalesniks.size();
    }
}

