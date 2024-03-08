class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int count=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int temp=e.getValue();
            if(temp>max){
                count=0;
                max=temp;
                count+=temp;
            }else if(temp==max){
                count+=temp;
            }
        }
        return count;
    }
}