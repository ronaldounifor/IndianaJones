package model;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Item {
    private List<Item> items;

    public Bag() {
        items = new ArrayList<>();
    }

    public void placeItem(Item item) {
        items.add(item);
    }
}
