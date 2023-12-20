package de.ait.homework61;

public class Barmen {
    public static void main(String[] args) {
        BartenderThread bartenderThreadTee = new BartenderThread();
        BartenderThread bartenderThreadCoffee = new BartenderThread();
        BartenderThread bartenderThreadCocktail = new BartenderThread();

        bartenderThreadTee.start();
        bartenderThreadCoffee.start();
        bartenderThreadCocktail.start();
    }
}
