class Solution {
    public String maximumOddBinaryNumber(String s){
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<n-1;i++){
            if(i<count-1){
                ans.append('1');
            }else{
                ans.append('0');
            }
        }
        ans.append('1');
        return ans.toString();
    }
}