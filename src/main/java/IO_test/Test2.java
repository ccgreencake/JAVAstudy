package IO_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 01:12
 */
public class Test2 {
    /*1.ABC
3. FileInputStream是输入流，字节流，节点流
    4.1 返回int类型，表示读取一个字节
    4.2 返回int,参数表示读取多少个字节
    4.3 返回int,参数表示读取多少个字节，从第几个开始读，读取多长

    5.AB

    6.1 创建一个文件，如果存在则不创建
    6.2 如果使用FileOutputStream(String name,boolean append)构造器，append为true，则在文件末尾追加，否则覆盖,创建FileOutputStream对象时，会产生异常


    7. 流的关闭应该在finally里，并且创建的时候要么放在try里，要么抛出异常

    */

//    8.
public static void main(String[] args) {
    FileOutputStream fileOutputStream = null;
    try {
        fileOutputStream = new FileOutputStream("test.txt",true);
        fileOutputStream.write("Hello World".getBytes());
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    FileInputStream fileInputStream = null;
    try {
        fileInputStream = new FileInputStream("test.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1){
            String s = new String(bytes,0,len);
            System.out.println(s);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
10.ABC

11.1字符
11.2字符
11.3字符
11.4字节
11.5字节

12
ObjectInputStream   字节流 读八种基本类型，读对象，缓冲功能
ObjectOutputStream  字节流 写八种基本类型，写对象，缓冲功能
BufferedInputStream 字节流 缓冲功能
BufferedOutputStream 字节流 缓冲功能
DataInputStream     字节流 读八种基本类型
DataOutputStream    字节流 写八种基本类型
PrintWriter         字符流 写对象 写字符串并换行 写八种基本类型 缓冲功能
PrintStream         字节流 写对象 写字符串并换行 写八种基本类型 缓冲功能
BufferedReader      字符流 读对象 读入一行文本 缓冲功能


13. 要求实现Serializable接口
使用transient修饰符

15. 一个是写入对象的tostring，一个是写入对象本身

16. B


 */
}
