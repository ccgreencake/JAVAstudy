package Thread_Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 16:30
 */
public class Test1 {
    public static void main(String[] args) {
//        1.现在有A1、A2、A3三个线程(分别打印0~10、11~20、21~30)，你怎样保证A2在A1执行完后执行，A3在A2执行完后执行？
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable,"A1");
        Thread thread2 = new Thread(myRunnable,"A2");
        Thread thread3 = new Thread(myRunnable,"A3");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
//
//2.写两个线程，一个线程打印 1~52，另一个线程打印字母A-Z打印顺序为12A34B56C⋯⋯51Y52Z（2个数字 1个字母）。

        Thread_number threadNumber = new Thread_number();
        Thread_word threadWord = new Thread_word();
        threadNumber.start();
        threadWord.start();







    }
    static class MyRunnable implements Runnable{
        int n = 1;
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+":"+n);
                n++;
            }
        }
    }
    static class Thread_number extends Thread{
        @Override
        public void run() {
            synchronized (Demo.class) {
                for (int i = 1; i < 53; i++) {
                    System.out.print(i);
                    if (i % 2 == 0) {
                        try {
                            Demo.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Demo.class.notify();
                }
            }
        }
    }
    static class Thread_word extends Thread{
        @Override
        public void run() {
            synchronized (Demo.class) {
                for (int i = 65; i < 91; i++) {
                    System.out.print((char) i);
                    Demo.class.notify();
                    try {
                        Demo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }


}
