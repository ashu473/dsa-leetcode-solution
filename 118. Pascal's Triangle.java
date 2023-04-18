class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();  // we add lists in this ans list
        if(numRows<=0) return ans;   // if numRows<=0, return ans
        ArrayList<Integer> prev=new ArrayList<>();
        prev.add(1);
        ans.add(prev);   // we add a [1] in ans
        for(int i=2;i<=numRows;i++){ // we start from row 2 as we already add [1] in row 1 
            ArrayList<Integer> curr=new ArrayList<>();
            // [1,mid element,1]
            curr.add(1);    
            for(int j=0;j<prev.size()-1;j++){
                curr.add(prev.get(j)+prev.get(j+1));  // mid element of curr list
            }
            curr.add(1);
            ans.add(curr); // add curr list in ans 
            prev=curr;   // make curr list as prev
        }
        return ans;   // return ans
    }
}