package com.pc.concepts.multithreading;

//creatig using runnable
class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadsDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        Thread thread = new Thread(t1);
        thread.start();

        System.out.println("Hi");
        System.out.println("How are you");
    }

}
