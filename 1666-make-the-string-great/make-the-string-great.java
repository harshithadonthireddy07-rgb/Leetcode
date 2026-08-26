class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && Character.toLowerCase(stack.peek()) ==Character.toLowerCase(c) && stack.peek() !=c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
        
    }
}