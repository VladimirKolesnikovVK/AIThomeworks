package de.ait.homework55;

import java.util.Set;

public class FashionItem {
    private String name;
    private double price;
    private FashionCategory fashionCategory;
    private Set<Season> seasons;

    public FashionItem(String name, double price, FashionCategory fashionCategory, Set<Season> seasons) {
        this.name = name;
        this.price = price;
        this.fashionCategory = fashionCategory;
        this.seasons = seasons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public FashionCategory getFashionCategory() {
        return fashionCategory;
    }

    public void setFashionCategory(FashionCategory fashionCategory) {
        this.fashionCategory = fashionCategory;
    }

    public Set<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(Set<Season> seasons) {
        this.seasons = seasons;
    }

    public FashionCategory getCategory() {
        return fashionCategory;
    }
}
