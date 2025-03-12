package com.example.thread;

class A extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("A");
        }
    }
}


    class B extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B");
            }
        }
    }


    class Main
    {
        public static  void main(String[] args) {
            A a1 = new A();
            B b1 = new B();
            a1.start();
            b1.start();
        }
    }




