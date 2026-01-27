package com.leetcode.easy;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        char[] firstWord = s.toCharArray();
        char[] secondWord = t.toCharArray();
        if(firstWord.length != secondWord.length) {
            return false;
        }

        for (int i = 0; i < firstWord.length; i++) {
            hashMap.put(firstWord[i], hashMap.getOrDefault(firstWord[i], 0) + 1);
        }
        for (int i = 0; i < secondWord.length; i++) {
            hashMap.put(secondWord[i], hashMap.getOrDefault(secondWord[i], 0) - 1);
        }

        for (int count : hashMap.values()) {
            if (count != 0) {
                return false;
            }
        }


        return true;
    }
}
