package Web_Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/14 19:13
 */
public class Demo {
//    1、综合练习(注册登录)
//    基于TCP网络编程实现用户注册登录功能(技术点：集合、IO流、多线程、网络编程)
//    注册：
//    客户端向服务端注册用户,服务端接收用户信息，如果注册成功使用对象流将对象保存到文件中,并返回注册成功还是失败(要求:用户名不重复)
//    登录：
//    客户端向服务端登录用户,服务端接收用户信息,使用对象流从文件中查询是否有该用户信息，返回登录成功还是失败
public static void main(String[] args) throws UnknownHostException {
    InetAddress[] localHost = InetAddress.getAllByName("www.baidu.com");
    System.out.println(localHost);
    for (InetAddress inetAddress : localHost) {
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
        System.out.println("-----------");
    }
}
}

