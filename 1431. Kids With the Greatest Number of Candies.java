class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int maxCandies = 0;
        for (int i : candies) {     // find the maxCandies
            maxCandies = Math.max(maxCandies, i);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=maxCandies){   // if candies[i]+extraCandies>=maxCandies
                ans.add(true);           // add true
            }else{
                ans.add(false);          // add false
            }
        }
        return ans;   // return ans
    }
}