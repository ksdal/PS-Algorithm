class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        for(int element : numbers){
            sum += element;
        }
        
        return 45 - sum;
    }
}