package Exception_test;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/11 00:10
 */
public class TestMyException{
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        try {
            m(n);
        } catch (MyException1 ex1) {
            ex1.printStackTrace();
        } catch (MyException2 ex2) {
            System.out.println(ex2.getMessage());
            throw ex2;
        }
    }
    public static void m(int n) throws MyException1{
        if (n == 1){
            throw new MyException1("n==1");
        }else{
            throw new MyException2("n==2");
        }
    }
}
