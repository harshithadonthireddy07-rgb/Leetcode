class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int score=0;
        if(sum>9*num){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;i++){
            int d=Math.min(sum,9);
            sb.append(d);
            sum-=d;
        }
        


    return sb.toString();    
    }
}