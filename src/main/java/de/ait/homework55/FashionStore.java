package de.ait.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FashionStore {
    private Map<FashionCategory, Set<FashionItem>> fashionItemsMap;

    public FashionStore() {
         fashionItemsMap = new EnumMap<>(FashionCategory.class);
        for (FashionCategory category : FashionCategory.values()) {
            fashionItemsMap.put(category, new HashSet<>());
        }
    }

    public void addFashionItem(FashionItem item) {
        fashionItemsMap.get(item.getCategory()).add(item);
    }

    public void displayItemsBySeason(Season season) {
        System.out.println("Fashion Items for Season " + season + ":");
        for (FashionCategory category : fashionItemsMap.keySet()) {
            Set<FashionItem> items = fashionItemsMap.get(category);
            for (FashionItem item : items) {
                if (item.getSeasons().contains(season)) {
                    System.out.println("Category: " + category + ", Name: " + item.getName() + ", Price: " + item.getPrice());
                }
            }
        }
    }
}

