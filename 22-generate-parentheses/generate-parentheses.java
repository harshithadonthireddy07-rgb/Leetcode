class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans =new ArrayList<>();
        generate("",ans,n);
        return ans;
        
    }

    public void generate(String curr,List<String> ans ,int n){
        if(curr.length() == 2*n){
            if(isvalid(curr)){
                ans.add(curr);
            }
            return;
        }
        generate(curr+')',ans,n);
        generate(curr+'(',ans,n);
    }

    public boolean isvalid(String curr){
        int count=0;
        for(char c:curr.toCharArray()){
            if(c =='('){
                count++;
            }
            else if(c ==')'){
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return count==0;
    }
}