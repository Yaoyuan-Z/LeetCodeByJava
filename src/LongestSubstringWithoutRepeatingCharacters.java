import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) {
            return 0;
        }
        int maxLength = 1;
        int tempLength = 1;
        int i = 0, j = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(i), 0);
        while (i < s.length() && j < s.length()) {
            char current = s.charAt(j);
            if (map.containsKey(current)) {
                int temp = i;
                i = Math.max(map.get(current) + 1, temp);
                tempLength = j - i + 1;


                map.replace(current, j);
            } else {
                tempLength += 1;
                map.put(s.charAt(j), j);
            }
            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
            //System.out.println(j+" "+i+" "+maxLength+map.toString());
            j += 1;
        }


        return maxLength;
    }
}
