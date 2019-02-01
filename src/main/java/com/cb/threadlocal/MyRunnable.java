package com.cb.threadlocal;

public class MyRunnable implements Runnable {
        private static ThreadLocal<Integer> threadLocal =
                new ThreadLocal<Integer>();
        @Override
        public void run() {
            threadLocal.set( (int) (Math.random() * 100D) );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(threadLocal.get());
        }
    }