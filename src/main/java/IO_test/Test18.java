package IO_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 02:18
 */
public class Test18 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件名");
        String fileName = new Scanner(System.in).next();
        File file = new File(fileName);
        if(file.exists()){
            //copy
            FileOutputStream fileOutputStream = null;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(fileName);
                fileOutputStream = new FileOutputStream("copy_"+fileName);
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1){
                    fileOutputStream.write(bytes,0,len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
