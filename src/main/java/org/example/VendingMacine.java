package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMacine {
    protected List<Toy> toys = new ArrayList<>();
    protected List<Toy> prizs = new ArrayList<>();

    public void add(Toy toy){
        toys.add(toy);
    }

    public void getRandom(){
        double totalFrequency = 0.0;
        for (Toy toy : toys){
            totalFrequency += toy.getFrequency();
        }

        int idx = 0;
        for(double r = Math.random() * totalFrequency; idx < toys.size() - 1; ++idx){
            r -= toys.get(idx).getFrequency();
            if (r <= 0.0) break;
        }
        Toy priz = toys.get(idx);
        //toys.remove(idx);
        prizs.add(priz);
    }

    public List<Toy> getPrizs() {
        return prizs;
    }
}
