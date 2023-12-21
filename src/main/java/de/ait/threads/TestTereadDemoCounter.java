package de.ait.threads;

public class TestTereadDemoCounter {
    public static void main(String[] args) {
        ConterPrinter conterPrinter = new ConterPrinter();

        TereadDemoCounter tereadDemoCounter = new TereadDemoCounter("thread-1",conterPrinter);
        TereadDemoCounter tereadDemoCounterSecond = new TereadDemoCounter("thread-2",conterPrinter);

        tereadDemoCounter.start();
        tereadDemoCounterSecond.start();

        try {
            tereadDemoCounter.join();
            tereadDemoCounterSecond.join();
        }catch (InterruptedException exception){
            System.out.println("exception" + exception);
        }
    }
}
