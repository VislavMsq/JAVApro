package files;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.IOException;
public class RandomAccFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("raf.txt","rw");
//        int a = file.read();
//        System.out.println((char) a);

//        String s = file.readLine();
//        System.out.println(s);

//        file.seek(99); // помещение коретки на какую либо позицию
//        String s2 = file.readLine();
//        System.out.println(s2);

//        long position = file.getFilePointer();
//        System.out.println(position);

        file.seek(0);
        file.writeBytes("@@@");
        file.close();
    }
}
