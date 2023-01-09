package file;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Count {
    //시도별 이동횟수 key: "전입코드, 전출코드" (문자열) / value: 횟수(1)
    public static Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();

        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            //fromToString()

            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }
}
