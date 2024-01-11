import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i < discount.length; i++){
            String[] target_discount = Arrays.copyOfRange(discount, i, i + 10);
            
            boolean flag = true;
            
            List<String> target_discount_list = Arrays.asList(target_discount);
            
            for(int j = 0; j < want.length; j++) {
                String item = want[j];
                long count = target_discount_list.stream().filter(str -> item.equals(str)).count();
                
                if(number[j] != count)
                    flag = false;
            }
            
            
            if(flag)
                answer++; 
        }
        
        return answer;
    }
}