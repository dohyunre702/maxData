package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Test1 {
    String filename;

    public Test1(String filename) {
        this.filename = filename;
    }

    public void readByLine(String filename) throws IOException {
        FileReader f1 = new FileReader(filename);
        BufferedReader reader = new BufferedReader(f1);

        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }
}
public class ReadByLine {
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\moonf\\git\\maxData\\src\\test\\datatest1.txt";

        Test1 t1 = new Test1(address);
        t1.readByLine(address);

        String s = "./from_to3.txt";
        File file = new File(s);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
