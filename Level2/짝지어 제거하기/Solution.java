import java.util.*;
class Solution
{
    public int solution(String s)
    {   
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i = 0 ; i < arr.length ; i++){
            if(stack.isEmpty()==true){
                stack.push(arr[i]);
            }else{
                if(stack.peek() == arr[i]) stack.pop();
                else stack.push(arr[i]);
            }
        }


        return stack.isEmpty() ? 1 : 0;
    }
}