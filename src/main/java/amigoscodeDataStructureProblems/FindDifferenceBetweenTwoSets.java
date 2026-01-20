package amigoscodeDataStructureProblems;

import java.util.HashSet;
import java.util.Set;

public class FindDifferenceBetweenTwoSets {
    public Set<Integer> findDifferenceBetweenTwoSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>();
        for (int elements : set1){
            if (!set2.contains(elements)){
                result.add(elements);
            }
        }
        return result;
    }
}
