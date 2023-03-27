class Solution {
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp){
            int ht = Math.min(height[lp],height[rp]);
            int width = rp - lp;
            int currArea = ht * width;
            maxWater = Math.max(currArea,maxWater);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
}