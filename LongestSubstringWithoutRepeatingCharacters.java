/*
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map= new HashMap<Character,Integer>();
        
        int len=s.length();
        int maxlen=0;
        int curlen=0;
        int index=0;
        int startIndex=0;
        for(int i=0; i<len; i++){
          char ch=s.charAt(i);
          if(!map.containsKey(ch)|| (map.get(ch)<startIndex)){
            map.put(ch, i);
            curlen++;
            if(curlen>maxlen){
              maxlen=curlen;
            }        
          }
          else{
            index=map.get(ch);
            curlen=i-index;
            startIndex=index+1;
            map.put(ch,i);
          }
        }
        
        return maxlen;
    }
}