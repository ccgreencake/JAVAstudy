package Exception_test;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/11 00:07
 */
public class MyException2 extends RuntimeException{
    MyException2(){
        super();
    }
    MyException2(String message){
        super(message);
    }
}
