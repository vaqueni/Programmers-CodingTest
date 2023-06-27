import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0 ; i < s.length() ; i++){
            s = rotate(s);
            Stack<Character> st = new Stack<>();
            for(int j = 0 ; j < s.length() ; j++){
                char ch = s.charAt(j);
                // 스택이 비어었을 경우 괄호를 넣는다.
                if(st.isEmpty()) st.push(ch);
                else{
                    if(ch == '(') st.push(ch);
                    else if(ch == '{') st.push(ch);
                    else if(ch == '[') st.push(ch);
                }
                if(ch == ')'){
                    if(st.peek() == '(') st.pop();
                    else break;
                }
                else if(ch == '}'){
                    if(st.peek() == '{') st.pop();
                    else break;
                }
                else if(ch == ']'){
                    if(st.peek() == '[') st.pop();
                    else break;
                }
                    
            }
            if(st.isEmpty()) answer++;
        }
        
        return answer;
    }
    String rotate(String s){
        return s.charAt(s.length()-1) + s.substring(0, s.length()-1);
    }
}