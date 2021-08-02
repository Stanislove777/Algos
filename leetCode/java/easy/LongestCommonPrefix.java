package leetCode.java.easy;

/*
    Name: LogestrCommonPrefix
	Author: Stanislav L.
	Date: 30/07/2021

    ***

    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

*/

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String pref = strs[0];
        
        if (strs[0].length() == 0 || strs.length == 0)
            return ("");
        
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(pref) != 0){
                pref = pref.substring(0, pref.length() - 1);
            }
        }
        return (pref);
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flater"}));
    }
}
