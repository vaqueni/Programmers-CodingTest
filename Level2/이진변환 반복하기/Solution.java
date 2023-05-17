class Solution {
    public int[] solution(String s) {
      int[] answer = new int[2];
      int zero = 0;
      int change = 0;
      while(!s.equals("1")){
          for(int i = 0 ; i < s.length() ; i++){ 
              if(s.charAt(i) == '0') {
                  zero++;
              }
          }
      s = s.replaceAll("0","");
      s=Integer.toBinaryString(s.length());
      change++;
          
  }
      answer[0]=change;
      answer[1]=zero;
      return answer;
}
}