package file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileManager {

    //1. 파일을 불러와 List<PopulationMove> 객체로 반환하는 readByLine 함수.
    public List<PopulationMove> readByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>(); //새로운 list 선언
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMove pm = parse(str);
            //동일 클래스 내에서는 메소드 바로 사용 가능
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    //1-1. readByLine에서 filename의 콘텐츠를 List<PopulationMove> 객체로 변환하는 parse 함수.
    public PopulationMove parse(String str) { //파일 한 줄이 매개변수
        String[] splittedLine = str.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[6]); //String type
    }

    //1-2. PopulationMove를 받아 String으로 반환 ("전출지, 전입지")
    public static String fromToString(PopulationMove populationMove) {
        return populationMove.getToSido() + "," + populationMove.getToSido() + "\n";
    }

    //2. 루트 디렉토리 위치에 새로운 파일을 생성한다.
    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //3. PopulationMove 객체의 내용을 새 파일에 입력한다.
    public void write(List<String> strs, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for(String str: strs) {
            writer.write(str);
        }
        writer.close();
    }
}
