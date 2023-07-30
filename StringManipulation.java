package dishansh.codeup;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
* @author : dishansh_singh_NBS
*
* */
public class StringManipulation {
    public static void main(String[] args) {
        System.out.println("Result:" + new StringManipulation().getLongestSubstringWithNonrepeatedCharacters("aabcd") + ".");
    }

    public int getLongestSubstringWithNonrepeatedCharacters(String word) {

        // "abcabcbb" -> abc
        // "bbbbb" -> b
        // "pwwkew" -> wke
        // aabcd -> abcd
        // dvdf -> vdf

        if(word.length() < 2){
            return word.length();
        }
        List<Character> subStringQueue = new ArrayList<>();

        String longestSubString = "";
        for(Character character: word.toCharArray()){
            if(subStringQueue.contains(character)) {
                final String[] currentString = {""};
                subStringQueue.forEach(character1 -> currentString[0] = currentString[0] + character1);
                if(longestSubString.length() < currentString[0].length()) {
                    longestSubString = currentString[0];
                }
                subStringQueue.remove(0);
            }
            subStringQueue.add(character);
        }
        System.out.println("SubString : "+ subStringQueue);
        System.out.println("Longest Substring: "+longestSubString);
        return Math.max(subStringQueue.size(), longestSubString.length());
    }
}
