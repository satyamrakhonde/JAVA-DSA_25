package Arrays.mediumLevelQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        System.out.println(groupAnagram(strs));
    }

    public static List<List<String>> groupAnagram(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            System.out.println(charArray);
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            System.out.println("sorted char  --  " + sortedS);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}