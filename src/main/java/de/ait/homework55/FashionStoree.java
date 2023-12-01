package de.ait.homework55;

import java.util.EnumSet;

public class FashionStoree {
    public static void main(String[] args) {
        FashionStore fashionStore = new FashionStore();

        FashionItem Shirt = new FashionItem("Shirt", 25.55, FashionCategory.CLOTHING, EnumSet.of(Season.SPRING, Season.SUMMER));
        FashionItem Sneakers = new FashionItem("Sneakers", 78.99, FashionCategory.SHOES, EnumSet.of(Season.SPRING, Season.AUTUMN));
        FashionItem Sunglasses = new FashionItem("Sunglasses", 19.90, FashionCategory.ACCESSORIES, EnumSet.of(Season.SUMMER));

        fashionStore.addFashionItem(Shirt);
        fashionStore.addFashionItem(Sneakers);
        fashionStore.addFashionItem(Sunglasses);

        fashionStore.displayItemsBySeason(Season.SPRING);
    }
}
