package Similarity;

import java.util.HashMap;
import java.util.Map;
public class MapSampleCode {
    public static void main(String[] args) {
        Map< String , Integer > sampleMap = new HashMap<String,Integer>();

        sampleMap.put("Std1",60);
        sampleMap.put("Std2",70);
        sampleMap.put("Std3",80);
        sampleMap.put("Std4",90);

        System.out.println(sampleMap);

        System.out.println(sampleMap.get("Std1"));

      /*  for(Map.Entry<String,Integer> m : sampleMap.entrySet()){

            System.out.println(m.getKey()+" "+m.getValue());
        }*/

for(Map.Entry<String , Integer > m : sampleMap.entrySet()){
    System.out.println(m.getKey() + " " + m.getValue());
}

    }
}
