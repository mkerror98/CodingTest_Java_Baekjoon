class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sheep = 12000 * n;
        int drink = 2000  * k;
        answer = sheep + drink;
        
        if(n>=10) {
            answer -= 2000 * (n/10);
        }
        
        return answer;
    }
}