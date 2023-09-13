package Collection_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/9 22:42
 */
public class Exam {
    public static void printList(List list){
//        补全代码如下：
        System.out.println("List中的元素是：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        //1.Collection 接口的特点是元素是单列集合
        //List 接口的特点是元素是有顺序的，可以重复
//        Set无顺序，不可重复
//        Map接口的特点是元素是双列集合，key不可以重复，value可以重复


//        2.
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Hello");
        list.add(1,"Learn");
        list.add(1,"Java");
        printList(list);

        //执行效果：
//        List中的元素是：
//        Hello
//        Java
//        Learn
//        World
//        如果改成LinkedList，则只需要改等号右边的ArrayList为LinkedList即可，ArrayList跟LinkedList都是List的实现类，但是ArrayList查询更快，但是增删慢，而LinkedList相反。实现上的区别，ArrayList是数组实现的，LinkedList是链表实现的。
//        如果改成Vector，则只需要改等号右边的ArrayList为Vector即可，Vector跟ArrayList的区别是Vector是线程安全的，而ArrayList是线程不安全的，所以Vector的效率比ArrayList低。而且实际开发中Vector也用得少。
//        3.的运行结果：
//        Hello
//        Learn
//
//        4.C

//      5.
//        1.
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(18,"zhang3",3000));
        workers.add(new Worker(25,"li4",3500));
        workers.add(new Worker(22,"wang5",3200));
//        2.在li4之前插入一个工人，信息为：(20,"zhao6",3300)
        workers.add(1,new Worker(20,"zhao6",3300));
//        3.
        workers.remove(3);
//        4.
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i));
        }
//        5.
        for (Worker worker:workers) {
            System.out.println(worker);
        }
//        6.

        //6.C

//7.hashcode方法错了，发生了强转，应该返回int的
        //8. 重写hashcode方法以及equals方法

//        9.1 如果键已存在则覆盖原来的值，如果不存在则添加
//        9.2 remove方法可以接受1或者2个参数，一个的时候是key，两个则是key和value
//        9.3 get方法表示获取key对应的value，get方法的参数表示key，返回值表示value
//        9.4 要想获得map中所有的键，应该是使用keySet方法，返回值是Set集合
//        9.5 要想获得map中所有的值，应该是使用values方法，返回值是Collection集合


//        12.D


    }
}
