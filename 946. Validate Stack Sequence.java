class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int j=0; // This pointer points to the popped array
        for(int i:pushed){
            st.push(i); // insert the value in stack
            while(!st.isEmpty() && st.peek()==popped[j]){ // if st.peek() values equal to popped[j]
                st.pop();
                j++;
            }
        }
        return st.isEmpty(); // it will return true if st is empty 
    }
}