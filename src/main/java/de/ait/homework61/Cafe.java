package de.ait.homework61;

public class Cafe {
    public static void main(String[] args) {
        BartenderThread bartenderThread = new BartenderThread();
        CoffeeMakerThread coffeeMakerThread = new CoffeeMakerThread();
        SommelierThread sommelierThread = new SommelierThread("Глютвейн");
        TeaMasterThread teaMasterThread = new TeaMasterThread("Ромашковый чай");

        bartenderThread.start();
        coffeeMakerThread.start();
        sommelierThread.start();
        teaMasterThread.start();
    }
}
