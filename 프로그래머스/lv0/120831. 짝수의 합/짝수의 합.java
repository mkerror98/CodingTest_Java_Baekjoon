class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 == 0) {
            for(int i=n; i>=2; i-=2) {
                answer += i;
            }
        }
        
        if(n%2 == 1) {
            for(int i=n-1; i>=2; i-=2) {
                answer += i;
            }
        }
        
        return answer;
    }
}