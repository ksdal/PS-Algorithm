class Solution {    
    public int solution(int num) {
        return (num == 1) ? 0 : method(num, 0);
    }
    
    public int method(long inputNumber, int count){
        long result = 0;
        
        result = ((inputNumber % 2) == 0) ? inputNumber / 2 : (inputNumber * 3) + 1;
        count++;
        
        if(result == 1){
            return count;
        } else if(count > 500)
            return -1;
        else
            return method(result, count);
            
    }
}