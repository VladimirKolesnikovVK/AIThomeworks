package de.ait.homework55;

public class FashionItem {
    private String name;
    private double price;
    private FashionCategory fashionCategory;
    private Season seasons;

    public FashionItem(String name, double price, FashionCategory fashionCategory, Season seasons) {
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

    public Season getSeasons() {
        return seasons;
    }

    public void setSeasons(Season seasons) {
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "название-'" + name +
                ", цена-" + price +
                ", категория-" + fashionCategory +
                ", сезон-" + seasons;
    }
}

