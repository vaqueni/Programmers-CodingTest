import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] temp = new int[book_time.length][2];
        for(int i = 0 ; i < book_time.length ; i++){
            temp[i][0] = toMinute(book_time[i][0]);
            temp[i][1] = toMinute(book_time[i][1]);
        }
        Arrays.sort(temp, (v1,v2)->{
            if(v1[0] == v2[0]) return v1[1] - v2[1];
            return v1[0] - v2[0];
        });
        PriorityQueue<Integer> endTime = new PriorityQueue<>();
        for(int[] book : temp){
            if(endTime.isEmpty()){// 첫번째 대실
                endTime.add(book[1] + 10);
                continue;
            }
            if(endTime.peek() <= book[0] ){// 새방을 안 할당할 때
                endTime.poll(); // 이전 방 청소 완료
                endTime.add(book[1]+10);
            }else{
                endTime.add(book[1]+10);
            }
        }
        return endTime.size();
    }
    
    int toMinute(String time){
        time = time.replaceAll(":","");
        int temp = Integer.parseInt(time);
        return 60*(temp/100) + temp%100;
    }
}