package com.company;

import java.util.Objects;

public class Item{
    private int cantitate;
    private Produs produs;

    public Item(Produs produs) {
        this.produs = produs;
        cantitate = 1;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return produs.equals(item.produs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produs);
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantitate=" + cantitate +
                ", produs=" + produs +
                "\n";
    }
}
