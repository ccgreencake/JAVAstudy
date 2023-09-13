package IO_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 01:49
 */
public class Test14 {
    public static void main(String[] args) {
        String s="";
        //用GBK读取test.txt文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test.txt");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1){
                s = new String(bytes,0,len,"GBK");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        写入
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream("test2.txt");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
            outputStreamWriter.write(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.close();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
