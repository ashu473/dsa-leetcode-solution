class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            if(binarySearch(nums2,nums1[i])){
                return nums1[i];
            }
        }
        return -1;
    }
    public boolean binarySearch(int[] nums2,int target){
        int l=0;
        int r=nums2.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums2[mid]>target){
                r=mid-1;
            }else if(nums2[mid]<target){
                l=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}