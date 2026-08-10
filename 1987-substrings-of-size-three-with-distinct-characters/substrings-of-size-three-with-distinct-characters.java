class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++){
            boolean repeat=false;
            for(int j=i;j<i+3;j++){
                for(int k=j+1;k<i+3;k++){
                    if(s.charAt(j)==s.charAt(k)){
                        repeat=true;
                    }
                }
            }
            if(!repeat){
                count++;
            }
        }
        return count;
    }
}