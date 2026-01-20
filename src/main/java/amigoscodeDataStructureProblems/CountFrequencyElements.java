package amigoscodeDataStructureProblems;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyElements {
    public Map<Integer, Integer> countFrequencyElements(Integer[] arr) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int num : arr){
          result.put(result.getOrDefault(num, 0) + 1,num);
        }
        return result;
    }
}

