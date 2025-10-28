/*## 4️⃣ Valid Anagram  
**LeetCode:** [#242](https://leetcode.com/problems/valid-anagram/)  
**GFG:** [Check if two strings are anagrams](https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/)  
**Companies:** Amazon, Goldman Sachs  
**Concepts:** Character frequency, Hashing  
**Difficulty:** 🟢 Easy  
*/
public class Solution4 {
    public boolean isAnagram(String s,String t){
         if(s.length()!=t.length()){
          return false;
         }
         int[]count=new int[26];
         for(int i=0;i<s.length();i++){
          count[s.charAt(i)-'a']++;
          count[t.charAt(i)-'a']--;
         }
         for(int c:count){
          if(c!=0){
                return false;
          }
         }
         return true;
    }
    public static void main(String[] args){
        Solution4 sol=new Solution4();
        String s="anagram";
        String t="nagaram";
        boolean result=sol.isAnagram(s,t);
        System.out.println("Are the two strings anagrams? " + result);
    }
  
}
