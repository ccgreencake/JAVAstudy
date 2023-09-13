package IO_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 02:09
 */
public class Test17 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream = new FileOutputStream("worldcup.txt");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write("2006/意大利\n2002/巴西\n1998/法国\n1994/巴西\n1990/德国\n1986/阿根廷\n1982/意大利\n1978/阿根廷\n1974/德国\n1970/巴西\n1966/英格兰\n1962/巴西\n1958/巴西\n1954/德国\n1950/乌拉圭\n1938/意大利\n1934/意大利\n1930/乌拉圭\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStreamWriter != null)
                outputStreamWriter.close();
                if (fileOutputStream != null)
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HashMap<Integer, String> champion = new HashMap<>();
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("worldcup.txt");
            byte[] bytes = new byte[1024];
            int len;
            String[] split = null;
            while ((len = fileInputStream.read(bytes)) != -1){
                String str = new String(bytes,0,len);
                split = str.split("\n");
            }

            for (String s : split) {
                split = s.split("/");
                champion.put(Integer.parseInt(split[0]),split[1]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null)
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("请输入年份");
        int year = new Scanner(System.in).nextInt();
        if (champion.containsKey(year))
        System.out.println(year+"年的冠军是"+champion.get(year));
        else
            System.out.println("没有这个年份的冠军");
    }

}
