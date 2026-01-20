package amigoscodeDataStructureProblems;

import java.util.HashSet;
import java.util.Set;

public class CheckSetSubset {
    public boolean checkSetSubset(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> subset = new HashSet<>(set1);
        for (int element :subset){
            if (!set2.contains(element)) {
                return false;

            }
        }return true;
    }
}
