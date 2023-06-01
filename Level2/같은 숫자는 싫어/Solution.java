import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack <Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(stack.isEmpty()){
                stack.add(arr[0]);
            }
            if(stack.peek() == arr[i]) continue;
            else{
                stack.add(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for(int i = stack.size()-1 ; i >= 0 ; --i){
            answer[i] = stack.pop();
        }

        return answer;
    }
}