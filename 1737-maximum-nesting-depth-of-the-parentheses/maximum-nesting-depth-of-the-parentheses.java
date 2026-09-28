class Solution {
    public int maxDepth(String s) {
        int counter=0;
        int max=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                counter++;
            }
            if(ch==')'){
                counter--;
            }
            if(counter>max){
                max=counter;
            }
        }
        return max;
    }
}