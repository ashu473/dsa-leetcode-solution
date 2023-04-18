class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int n=word1.length();
        int m=word2.length();
        if(n>=m){  // if n>=m, we run loop for smaller in this case m
           for(int i=0;i<m;i++){
               ans.append(word1.charAt(i)); // append character from both word alternatively
               ans.append(word2.charAt(i));
           }
           ans.append(word1.substring(m)); // append the extra left character of word2
        }else{   // if n<m, we run loop for smaller in this case n
            for(int i=0;i<n;i++){
               ans.append(word1.charAt(i)); // append character from both word alternatively
               ans.append(word2.charAt(i));
           }
           ans.append(word2.substring(n)); // append the extra left character of word1
        }
        return ans.toString(); // retunr ans as string
    }
}