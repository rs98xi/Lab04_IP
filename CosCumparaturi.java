package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CosCumparaturi {
    List<Item> listaIteme;

    public CosCumparaturi() {
        listaIteme = new ArrayList<>();
    }

    public CosCumparaturi(List<Item> listaIteme) {
        this.listaIteme = listaIteme;
    }

    public boolean addItem(Item item){
        for (Item existItem : listaIteme){
            if (existItem.equals(item)){
                existItem.setCantitate(existItem.getCantitate()+1);
                return true;
            }
        }

        return listaIteme.add(item);
    }

    public boolean removeItem(Item item){
        for (Item existItem : listaIteme){
            if (existItem.equals(item)){
                if (existItem.getCantitate() == 1) {
                    listaIteme.remove(existItem);
                }
                else{
                    existItem.setCantitate(existItem.getCantitate()-1);
                }
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "CosCumparaturi{" +
                "listaIteme=" + listaIteme +
                '}';
    }

    public double getCostProduse(){
        double cost = 0;
        for (Item item : listaIteme){
            cost += item.getCantitate()*item.getProdus().getPret();
        }

        return cost;
    }

    public double getCostLivrare(){
        HashSet<String> prods = new HashSet<>();
        for (Item item : listaIteme){
            String numeProd = item.getProdus().getProducator();
            prods.add(numeProd);
        }

        int cnt = 0;
        for (String string: prods)
            cnt ++;
        return cnt*10;
    }

    public double getCostTotal(){
        double costProduse = getCostProduse();
        if (costProduse >= 300.0)
            return costProduse;
        return costProduse + getCostLivrare();
    }
}
