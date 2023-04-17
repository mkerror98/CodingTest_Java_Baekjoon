class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int pan = n/7;
        
        if(n%7 > 0) {  // 사람 수 나누기 7의 나머지가 0 이상일 때  
            if(n < 7) {  // 사람 수가 7 미만일 때
                answer = 1;
            }
            answer = pan + 1;    
        }
        
        if(n%7 == 0) {
            answer = n/7;
        }
        
    
        return answer;
    }
}