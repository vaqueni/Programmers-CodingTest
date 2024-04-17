import java.math.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(String str : s.split(" ")){
        int num = Integer.parseInt(str);
        if(num > max) max = num;
        if(num < min) min = num;
        }
        
        return answer = min + " " + max;
    }

    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        System.out.println(123);
    }
}