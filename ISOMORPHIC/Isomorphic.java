package ISOMORPHIC;

import java.util.*;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (hm.containsKey(c1) && hm.get(c1) != c2)
                return false;
            if (hm2.containsKey(c2) && hm2.get(c2) != c1)
                return false;
            hm.put(c1, c2);
            hm2.put(c2, c1);
        }
        return true;
    }
}