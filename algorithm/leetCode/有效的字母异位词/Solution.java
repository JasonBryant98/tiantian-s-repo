package leetCode.有效的字母异位词;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character,Integer>map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
           map.put(ch, map.getOrDefault(t.charAt(i), 0) - 1);
            if (map.get(ch) < 0) {
                return false;
            }
        }
        return true;
    }
}
