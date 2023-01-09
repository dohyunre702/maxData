package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        //파일 불러오기
        File f1 = new File("2021stat.csv");
        String address = f1.getAbsolutePath(); //"C:\\Users\\moonf\\git\\maxData\\2021stat.csv"

        //파일 읽어서 파싱하기
        FileManager fileManager = new FileManager();
        List<PopulationMove> pml = fileManager.readByLine(address);
        fileManager.readByLine(address);

        //파일생성을 위한 파일명 부여
        fileManager.createAFile("./from_to.txt");

        //파일에 데이터 저장
        List<String> strings = new ArrayList<>();
        for (PopulationMove pm : pml) {
            String fromTo = FileManager.fromToString(pm);
            strings.add(fromTo);
        }
        fileManager.write(strings, "./from_to.txt");

        //시도별 이동횟수 count
        Map<String, Integer> moveCntMap = Count.getMoveCntMap(pml);
        fileManager.createAFile("./each_sido_cnt.txt");
        List<String> cntResult = new ArrayList<>();
        for(String key:moveCntMap.keySet()) {
            String s = String.format("key:%s value:%d\n", key, moveCntMap.get(key));
            cntResult.add(s);
        }
        //count 데이터 새로운 파일에 저장
        fileManager.write(cntResult, "./each_sido_cnt.txt");
    }
}
