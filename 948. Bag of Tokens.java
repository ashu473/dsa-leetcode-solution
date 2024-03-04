class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int j=tokens.length-1;
        Arrays.sort(tokens);
        for(int i=0;i<tokens.length;i++){
            if(tokens[i]<=power){
                score++;
                power-=tokens[i];
            }else if(score>0){
                if(j>i){
                    score--;
                    power+=tokens[j];
                    j--;
                    i--;
                }
            }
        }
        return score;
    }
}