/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> digitToLetter = new HashMap<>();
        List<String> result = new ArrayList<>();


        digitToLetter.put('2', "abc");
        digitToLetter.put('3', "def");
        digitToLetter.put('4', "ghi");
        digitToLetter.put('5', "jkl");
        digitToLetter.put('6', "mno");
        digitToLetter.put('7', "pqrs");
        digitToLetter.put('8', "tuv");
        digitToLetter.put('9', "wxyz");


        for (int i = 0; i < digits.length(); i++) {
            List<String> temp = addNewDigits(result, digitToLetter.get(digits.charAt(i)));
            result = temp;
        }

        return result;

    }

    private List<String> addNewDigits(List<String> result, String mapDigit) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < mapDigit.length(); i++) {
            if (result.size() == 0) {
                list.add("" + mapDigit.charAt(i));
            } else {
                for (String s : result) {
                    list.add(s + mapDigit.charAt(i));

                }
            }
        }

        return list;
    }
}
