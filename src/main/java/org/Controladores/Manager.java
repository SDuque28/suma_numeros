package org.Controladores;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Integer> lista1;

    public Manager() {
        this.lista1 = new ArrayList<>();
    }

    public void addNumero(int numero){
        this.lista1.add(numero);
    }

    public int getSuma() {
        int total = 0;
        for (int j : lista1) {
            total += j;
        }
        return total;
    }

    public List<Integer> getLista1() {
        return lista1;
    }

    public void setLista1(List<Integer> lista1) {
        this.lista1 = lista1;
    }
}
