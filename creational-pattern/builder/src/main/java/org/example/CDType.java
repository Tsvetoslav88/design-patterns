package org.example;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packing) {
        items.add(packing);
    }

    public void getCost() {
        items.forEach(item -> System.out.println(item.price()));
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.print("CD name : " + item.pack());
            System.out.println(", Price : " + item.price());
        });
    }
}
