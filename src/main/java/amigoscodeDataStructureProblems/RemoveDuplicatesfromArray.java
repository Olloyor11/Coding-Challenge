package amigoscodeDataStructureProblems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesfromArray {
    public Set<Integer> removeDuplicatesfromArray(Integer[] arr){
        Set<Integer> result = new HashSet<>();
        result.addAll(List.of(arr));
        return result;
    }
}
