import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        char firstword = ' ';
        char lastword = ' ';
        int count = 0;
        List<String> list = new ArrayList<String>();
        for(String word: words){
            // 첫번째 단어일 때
            if(count == 0){
                lastword = word.charAt(word.length() - 1);
                count++;
                list.add(word);
                continue;
            }
            // 첫번째 글자 찾기
            firstword = word.charAt(0);
            
            if(firstword == lastword && !list.contains(word)){// 끝말잇기 성공할 경우
                lastword = word.charAt(word.length() - 1);
                count++;
                list.add(word);
                System.out.println(count);
            }else{ // 끝말잇기 실패 할 경우
                answer[0] = count%n+1;
                answer[1] = count/n+1;
                //System.out.println("실패!");
                return answer;
            }
        }



        return answer;
    }
}