package org.Controladores;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        //We add numbers to the list in manager
        manager.addNumero(1);
        manager.addNumero(2);
        manager.addNumero(3);
        int[] numeros1 = {1, 2, 3, 4, 5};
        int resultado1 = Manager.sumarElementos(numeros1);
        System.out.println("Suma del array [1,2,3,4,5]: " + resultado1);
    }
}