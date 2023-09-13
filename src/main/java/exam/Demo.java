package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/6 22:24
 */
public class Demo {
    public static void main(String[] args) {
//        创建一个数组，保存8个Product对象存入数组中(数据模拟即可，无需键盘录入)
        Product[] products = new Product[8];
        for (int i = 0; i < 8; i++) {
            double price = new Random().nextDouble()*100;
            Product product = new Product(i+1,"name"+(i+1), price,"info"+(i+1),i+10);
            products[i] = product;
        }
        System.out.println("排序前");
        for (Product product:products) {
            System.out.println(product);
        }
//        使用冒泡排序将数组中的Product对象按照价格进行降序排序
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (products[i].getPrice()>products[j].getPrice()){
                    Product x = products[i];
                    products[i] = products[j];
                    products[j] = x;
                }

            }
        }
        System.out.println("排序后");
        for (Product product:products) {
            System.out.println(product);
        }
//        创建一个List集合，将刚才数组中的元素放入到集合中
        List<Product> list = new ArrayList<>();
        for (Product product:products) {
            list.add(product);
        }
//        将list集合中的数据使用三种方式输出在控制台
        for (Product product:list) {
            System.out.println(product);
        }
        System.out.println("===================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===================================");
        list.forEach(System.out::println);
//        5、搜索整个d盘是否有product.txt文件(考虑子文件夹)，如果没有在D盘根目录下创建这个文件
//        不会
//        6、使用随机数随机获取List集合中的5个对象。4分
        for (int i = 0; i < 5; i++) {
            int y = new Random().nextInt(8);
            System.out.println(list.get(y));
        }
//        7、将上面的随机到的对象存入到product.txt中   4分
//        不会
//                (上机题要求：从第二题开始，每一个题目写成一个方法，后面的方法可以调用前面的方法)
//        8、将product.txt文件通过tcp协议上传到服务器上，服务端将文件保存到当前工程的upload文件夹下，并向客户端返回“收到”8分
//        不会
    }
}
