package amigoscodeDataStructureProblems;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
    public Character findFirstNonRepeatingCharacter(String word) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : word.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : word.toCharArray()){
            if (frequency.get(c) == 1){
                return c;
            }
        }
        return null;


    }
}
