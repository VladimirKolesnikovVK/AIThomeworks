package de.ait.threads;

public class TereadDemoCounter extends Thread{
    private Thread thread;
    private String threadname;
    ConterPrinter conterPrinter;

    public TereadDemoCounter(String threadname, ConterPrinter conterPrinter) {
        this.threadname = threadname;
        this.conterPrinter = conterPrinter;
    }
    @Override
    public void run(){
        synchronized (conterPrinter){
            System.out.println(threadname + "->");
            conterPrinter.print();
        }
        System.out.println("thread" + threadname + "is done");
    }

    public void start(){
        System.out.println("start thread" + threadname);
        if (threadname == null){

        }
    }
}
