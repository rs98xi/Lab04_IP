package com.company;

public class Utilizator {
    private CosCumparaturi cosCumparaturi;

    public Utilizator() {
        cosCumparaturi = new CosCumparaturi();
    }

    public boolean addProdus(Produs produs){
        Item item = new Item(produs);
        return cosCumparaturi.addItem(item);
    }

    public boolean removeProdus(Produs produs){
        Item item = new Item(produs);
        return cosCumparaturi.removeItem(item);
    }

    public CosCumparaturi getCosCumparaturi() {
        return cosCumparaturi;
    }
}
