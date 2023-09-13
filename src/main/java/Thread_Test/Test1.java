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






//
//3.利用多线程求解某范围质数,每个线程负责 1000范围：线程1找1-1000；线程 2 找 1001-2000；线程 3 找 2001-3000。编程程序将计算质数的总个数。
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


}
