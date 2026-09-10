class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result=new ArrayList<>();
        generate("",n,result);
        return result;
    }

    public void generate(String curr,int n,List<String> result){
        if(curr.length()==2*n){
            if(isvalid(curr)){
                result.add(curr);
            }
            return;
        }
        generate(curr+"(",n,result);
        generate(curr+")",n,result);


    }
    public Boolean isvalid(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else{
                count--;
            }
              if(count<0){
            return false;
        }
        }
      
        return count==0;
    }
}