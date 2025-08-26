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
        manager.addNumero(4);
        //We print the result of the sum
        System.out.println("La suma es: " + manager.getSuma());
    }
}