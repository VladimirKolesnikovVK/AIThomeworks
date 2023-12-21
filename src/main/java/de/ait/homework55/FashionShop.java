package de.ait.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop {
    private EnumMap<FashionCategory, Set<FashionItem>> catalog;

    public FashionShop() {
        catalog = new EnumMap<>(FashionCategory.class);
        for (FashionCategory category: FashionCategory.values()){
            catalog.put(category, new HashSet<>());
        }
    }

    public void addFationItem(FashionItem fashionItem){
        catalog.get(fashionItem.getFashionCategory()).add(fashionItem);
    }

    public void showInfoAboutSeason(Season season){
        for (FashionCategory fashionCategory: FashionCategory.values()){
            //System.out.println("категория --> " + fashionCategory);
            for (FashionItem item: catalog.get(fashionCategory)){
                if (item.getSeasons().equals(season)){
                    System.out.println(item.toString());
                }
            }
        }
    }
}

