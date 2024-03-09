// Method 1: Using Binary Search
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

// Method 2: Using HashMap

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],hm.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i]) && hm.get(nums1[i])>0){
                return nums1[i];
            }
        }
        return -1;
    }
} 

// Method 3: Using two pointer 
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        int n1=nums1.length;
        int n2= nums2.length;
        if (nums1[n1-1] < nums2[0] || nums2[n2-1] < nums1[0])
            return -1;
        while (i<n1 && j<n2) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else if (nums1[i] > nums2[j]) j++;
            else i++;
        }  
        return -1;
    }
}
