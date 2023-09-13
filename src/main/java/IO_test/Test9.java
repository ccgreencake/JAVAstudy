package IO_test;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : LiuDongBin
 * @create 2023/9/12 01:26
 */
public class Test9 {
//    9.
public static void main(String[] args) {
    File file = new File("test.dat");
    if (!file.exists()) {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeLong(10000L);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }else {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        long data = 0;
        try{
            dataInputStream = new DataInputStream(new FileInputStream(file));
            data = dataInputStream.readLong();
            data++;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                dataInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            dataOutputStream.writeLong(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
}
