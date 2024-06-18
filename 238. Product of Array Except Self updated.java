class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int total=1;
        int[] ans=new int[n];
        int count0=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                total*=nums[i];
            }else{
                count0++;
            }
        }
        for(int i=0;i<n;i++){
            if(count0>1){
                ans[i]=0;
            }else if(count0==1 && nums[i]!=0){
                ans[i]=0;
            }else if(count0==1 && nums[i]==0){
                ans[i]=total;
            }else{
                ans[i]=total/nums[i];
            }
        }
        return ans;
    }
}