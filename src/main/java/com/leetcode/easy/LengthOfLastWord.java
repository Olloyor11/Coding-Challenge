package com.leetcode.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String regex = "[,\\.\\s]";
        String[] myArray = s.split(regex);
        String lastWord = myArray[myArray.length-1];
        return lastWord.length();

    }
    public int lengthOfTheLastWord(String s){
        int count = 0;

        for (int i = s.length() - 1; i >=0 ; i--) {

            if (s.charAt(i) != ' '){
                count++;
            }else {
                if (count > 0)
                    return count;
            }

            }
        return count;

        }
    }

