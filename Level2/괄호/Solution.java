// 올바른 괄호

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String str = "()()";
        Solution sol = new Solution();
        
        System.out.println(sol.solution(str));
    
    }
    
    public boolean solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char temp = s.charAt(i);
            if(temp == '('){
            stack.push(temp);
            }else{ // pop을 할수 없는 경우 false
                if(pop2(stack) == false) return false;
            }
        }
        if(stack.size() == 0) return true;
        // 괄호가 남는 경우
        else return false;
        
    }
    
public boolean pop2(Stack<Character> stack){
    if(stack.size() == 0) return false;
    else {
        stack.pop();
        return true;
    }
    
}

}
