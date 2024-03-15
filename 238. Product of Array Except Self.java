class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product=1;
        int count0=0;
        for(int i:nums){
            product*=i;
            if(i==0){
                count0++;
            }
        }

        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0 && count0==1){
                return ans(nums,n);
            }else if(nums[i]==0 && count0>1){
                res[i]=0;
            }else{
                res[i]=product/nums[i];
            }
        }
        return res;
    }
    public int[] ans(int[] arr,int n){
        int[] res=new int[n];
        int mul=1;
        for(int i:arr){
            if(i!=0){
                mul*=i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                res[i]=0;
            }else{
                res[i]=mul;
            }
        }
        return res;
    }
}