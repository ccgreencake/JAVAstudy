package Thread_Test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 15:09
 */
public class Demo {
    public static void main(String[] args) {
        /* 1.单cpu执行多个线程原理：cpu在多个线程之间切换执行，切换速度非常快，看起来像是同时执行
        2.C
        3.C
        4.A

         */
//        5.
        class MyThread1 extends Thread{
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 26; j++) {
                        System.out.println(j);
                    }
                }
            }
        }
        class MyThread2 implements Runnable{
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j < 26; j++) {
                        System.out.println((char)(j+97));
                    }
                }
            }
        }
        new MyThread1().start();
        new Thread(new MyThread2()).start();
        /* 6.使线程同步，让线程1执行后再执行线程2
        7.C
        8.C
        9.创建t1有问题，应该是Thread t1 = new Thread(new MyThread1()
        题目没有明确说明要输出什么样的结果，所以这样改就可以，如果要改成先输出100个hell再100个world，只需在两个run方法中加上synchronized关键字即可，并且要对同一对象。
        或者也可以加lock，然后在run方法中加lock.lock()和lock.unlock()，这样也可以实现同步。
        如果说是交替打印，即先输出一个hello再输出一个world，那么可以用wait和notify来实现，但是要注意的是，wait和notify必须要在同步代码块中使用，所以要加synchronized关键字。
        也就是说在线程1中输出完hello后要wait，然后在线程2中打印world后唤醒，然后再wait，然后再唤醒，如此循环。

         */
    }

}
