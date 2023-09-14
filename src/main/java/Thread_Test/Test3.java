package Thread_Test;

import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/13 22:31
 */
public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //
//3.利用多线程求解某范围质数,每个线程负责 1000范围：线程1找1-1000；线程 2 找 1001-2000；线程 3 找 2001-3000。编程程序将计算质数的总个数。
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f1 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return thread1.call();
            }
        });
        Future<Integer> f2 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return thread2.call();
            }
        });
        Future<Integer> f3 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return thread3.call();
            }
        });

        System.out.println(f3.get()+f2.get()+f1.get());
        es.shutdown();


    }
    static class Thread1 implements Callable {
        @Override
        public Integer call() throws Exception {
            int n = 0;
            for (int i = 2; i < 1000; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
//                        System.out.println(getName() + ": " + i);
                    n++;
                }
            }
            return n;
        }
    }
    static class Thread2 implements Callable{
        @Override
        public Integer call() throws Exception {
            int n = 0;
            for (int i = 1001; i < 2000; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
//                        System.out.println(getName() + ": " + i);
                    n++;
                }
            }
            return n;
        }
    }
    static class Thread3 implements Callable{
        @Override
        public Integer call() throws Exception {
            int n = 0;
            for (int i = 2001; i < 3000; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
//                        System.out.println(getName() + ": " + i);
                    n++;
                }
            }
            return n;
        }
    }


}
