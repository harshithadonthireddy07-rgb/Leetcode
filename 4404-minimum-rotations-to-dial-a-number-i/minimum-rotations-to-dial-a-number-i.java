class Solution {
    public int minRotations(String s) {
        int current=0;
        int total=0;
        for(char ch:s.toCharArray()){
            int num=ch-'0';
            int diff=Math.abs(num-current);
            int temp=Math.min(diff,10-diff);
            total+=temp;
            current=num;
        }
    return total;
    }
}