package de.ait.homework55;

public class CatalogClient {
    public static void main(String[] args) {
        FashionShop fashionShop = new FashionShop();
        FashionItem fashionItemWatch = new FashionItem("часы",2000.0,FashionCategory.АКСЕССУАРЫ,Season.ВСЕСЕЗОН);
        FashionItem fashionItemCoat = new FashionItem("пальто",250.0,FashionCategory.ОДЕЖДА,Season.ЗИМА);
        FashionItem fashionItemBoots = new FashionItem("туфли",500.0,FashionCategory.ОБУВЬ,Season.ЛЕТО);

        fashionShop.addFationItem(fashionItemWatch);
        fashionShop.addFationItem(fashionItemCoat);
        fashionShop.addFationItem(fashionItemBoots);

        fashionShop.showInfoAboutSeason(Season.ВСЕСЕЗОН);
        fashionShop.showInfoAboutSeason(Season.ЛЕТО);
        fashionShop.showInfoAboutSeason(Season.ЗИМА);
        fashionShop.showInfoAboutSeason(Season.ВЕСНА);
    }
}
