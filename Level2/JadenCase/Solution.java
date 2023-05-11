class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strs = s.split(" ");

        for(int i = 0 ; i<strs.length ; i++){
            String temp = strs[i];

            // 문자열의 길이가 0이면 --> 띄어쓰기가 여러개 --> 띄어쓰기 횟수를 보전해야한다.
            if(temp.length() ==0) answer += " ";
            
            else{
                answer += temp.toUpperCase().substring(0,1);
                answer += temp.toLowerCase().substring(1,temp.length());
                if(i == strs.length -1) break;
                else answer += " ";
            }
        }
        
    	
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer+" ";
        }
        return answer;
    }

public static void main(String[] args) {
    Solution sol = new Solution();
    String str1 = "This is    an apple";
    String[] array = str1.split(" ");

    for(String i : array){
        System.out.print(i+"|");
    }
    System.out.println(array.length);
    System.out.println(sol.solution(str1));
}

}