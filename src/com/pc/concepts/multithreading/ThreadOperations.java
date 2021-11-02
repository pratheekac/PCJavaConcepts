package com.pc.concepts.multithreading;

class MyThreadEx extends Thread{
    public void run() {
        System.out.println("This is user defined thread");
    }
}

public class ThreadOperations {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started...");

        int x = 34 + 67;
        System.out.println("sum is " + x);
        //get the name of thread
        Thread t = Thread.currentThread();

        System.out.println("Name of thread " +t.getName());
        //rename the thread
        t.setName("My main");

        System.out.println("Name of thread " +t.getName());

        //mili sec
        t.sleep(1000);

        //id
        System.out.println("Id of thread "+ t.getId());

        //start another thread
        MyThreadEx t1 = new MyThreadEx();
        t1.start();

        System.out.println("Program Terminated...");
    }
}
