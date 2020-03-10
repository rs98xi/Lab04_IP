package com.company;

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator = new Utilizator();

        Produs produs1 = new Produs("umbrela", 5.2);
        Produs produs2 = new Produs("telefon", 4);
        Produs produs3 = new Produs("laptop", 1);
        Produs produs4 = new Produs("iphone", 9);

        utilizator.addProdus(produs1);
        utilizator.addProdus(produs2);
        utilizator.addProdus(produs3);
        utilizator.addProdus(produs4);

        utilizator.addProdus(produs1);
        utilizator.addProdus(produs1);

        utilizator.removeProdus(produs4);

        System.out.println(utilizator.getCosCumparaturi());

        System.out.println(utilizator.getCosCumparaturi().getCostTotal());
    }
}
