class Solution {
    public boolean checkString(String s) {
        Boolean seen=false;
        for(char c:s.toCharArray()){
            
            if(c=='b'){
                seen=true;
            }
            else if(seen){
                seen=false;
                return seen;

            }
        }
        return true;
    }
}