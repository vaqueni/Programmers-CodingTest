import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        answer = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            int gcd = gcd(answer,arr[i]);
            answer = answer * arr[i]/gcd; // A*B = LCM*GCM --> LCM = A*B/GCM
        }
    
    return answer;
}
    int gcd(int a, int b){
        if(a%b == 0) return b;
        else return gcd(b, a%b);
    }
}