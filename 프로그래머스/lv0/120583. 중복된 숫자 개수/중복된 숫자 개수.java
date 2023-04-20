class Solution {
    public int solution(int[] array, int n) {
        int numberOfn = 0;
        
        for(int i=0; i<array.length; i++) {
            if(n==array[i]) {
                numberOfn++;
            }
        }
        
        return numberOfn;
    }
}