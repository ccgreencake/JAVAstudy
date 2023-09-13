package IO_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 01:13
 */
public class TestMyFile {
    public static void main(String[] args) {
//        2.
        File file;
        file = new File("hello.txt");
        System.out.println(file.exists());
        if (file.exists()){
            System.out.println(file.getAbsolutePath());
        }

    }
}
