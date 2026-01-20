package amigoscodeDataStructureProblems;

import java.util.HashMap;
import java.util.Map;

public class FindCommonElementsWithCounts {
    public static void main(String[] args) {
        FindCommonElementsWithCounts finder = new FindCommonElementsWithCounts();

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 3, 4};

        System.out.println(finder.findCommonElementsWithCounts(arr1, arr2));


        int[] arr3 = {1, 2, 3};
        int[] arr4 = {4, 5, 6};
        System.out.println(finder.findCommonElementsWithCounts(arr3, arr4));


        int[] arr5 = {1, 2, 1};
        int[] arr6 = {1, 2, 3};
        System.out.println(finder.findCommonElementsWithCounts(arr5, arr6));

    }
    public Map<Integer, Integer> findCommonElementsWithCounts(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> frequencyArr1 = new HashMap<>();
        for (int nums : arr1) {
            frequencyArr1.put(nums, frequencyArr1.getOrDefault(nums, 0) + 1);
        }

        Map<Integer, Integer> frequencyArr2 = new HashMap<>();
        for (int nums : arr2) {
            frequencyArr2.put(nums, frequencyArr2.getOrDefault(nums, 0) + 1);

        }

        for (Integer key : frequencyArr1.keySet()){
            if(frequencyArr2.containsKey(key)){
            map.put(key,2 );
            }
        }
        return map;
    }
}
