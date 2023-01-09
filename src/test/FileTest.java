package test;

import java.io.File;
import java.io.IOException;


public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("2021stat.txt");
        String address = f1.getAbsolutePath();
        //.getAbsolutePath(): 파일의 절대경로 반환
        System.out.println(address);
    }
}
