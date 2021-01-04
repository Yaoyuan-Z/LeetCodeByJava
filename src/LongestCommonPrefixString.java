/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ""
 */
public class LongestCommonPrefixString {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 ){
            return "";
        }
        String result = strs[0];
        for(int i =1;i<strs.length;i++){
            result = longestCommonPrefixBetweenTwoStr(strs[i],result);
        }


        return result;
    }

    public String longestCommonPrefixBetweenTwoStr(String a, String b){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i< Math.min(a.length(),b.length());i++){
            if(a.charAt(i) == b.charAt(i)){
                result.append(a.charAt(i));
            }else {
                break;
            }
        }
        return result.toString();
    }
}
