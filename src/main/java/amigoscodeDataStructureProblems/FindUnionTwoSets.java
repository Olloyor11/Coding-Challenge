package amigoscodeDataStructureProblems;

import java.util.HashSet;
import java.util.Set;

public class FindUnionTwoSets {
    public Set<Integer> findUnionTwoSets(Set<Integer> set, Set<Integer> integerSet){
        Set<Integer> union = new HashSet<>(set);
        union.addAll(integerSet);
        return union;
    }
}
