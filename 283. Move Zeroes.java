/* 
It will give the answer without maintaining the relative order
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }else if(nums[i]!=0){
                i++;
            }
        }
    }
}*/
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n=nums.length;
//         int i=0;
//         int j=0;
//         while(j<n){
//             if(nums[i]!=0){
//                 i++;
//                 j++;
//             }else if(nums[i]==0 && nums[j]==0){
//                 j++;
//             }else if(nums[i]==0 && nums[j]!=0){
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 i++;
//             }
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos++]=nums[i];
            }
        }
        for(int i=pos;i<nums.length;i++){
            nums[i]=0;
        }
    }
}