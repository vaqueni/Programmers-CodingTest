import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ArrayList<Integer> solution (int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<>();
  
        for(int i = 0 ; i < speeds.length ; i++){
            int temp = (int)(Math.ceil( (100.0 - progresses[i]) / speeds[i]) );
            q.add(temp);
        }
         
        while(!q.isEmpty()){
            int day = q.poll();
            int count = 1;
            while(!q.isEmpty() && (day >= q.peek()) ){
                count++;
                q.poll();
            }
            answer.add(count);
        }
        return answer;
    }


}