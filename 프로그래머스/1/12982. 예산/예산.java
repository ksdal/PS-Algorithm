import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int remainBudget = budget;
        int count = 0;
        
        for(int item : d){
            remainBudget -= item;
            count++;
            
            if(remainBudget < 0){
                count--;
                break;
            } 
        }
    
        
        return count;
    }
}