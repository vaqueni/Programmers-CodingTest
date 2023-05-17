class Solution {
    public int solution(int n) {
        int answer = 0;
        int oneNum = 0;
    
        int nextOneNum = 0;
        oneNum = oneNum(n);
        while(true){
            if(oneNum == oneNum(++n)) break;
        }
        return n;
    }
    // 정수를 이진법으로 변환한 후에 1의 개수를 세는 함수
    public int oneNum(int n){
        int output = 0;
        String bin = Integer.toBinaryString(n);
        // System.out.println("int: "+n+" bin: "+bin);
        for(int i = 0 ; i < bin.length() ; i++){
            if(bin.charAt(i) == '1') output++;
        }
        return output;
    }
}