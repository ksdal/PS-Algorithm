import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, Integer> ht = new HashMap<String, Integer>();
        
        for(int i = 0; i < clothes.length; i++) {
            if(ht.containsKey(clothes[i][1]) == false) {
                int count = 1;
                
                ht.put(clothes[i][1],  count);
            } else {
                int count = ht.get(clothes[i][1]);
                count++;
                
                ht.replace(clothes[i][1],  count);
            }
        }
        int multi_count = 1;
        for(String key : ht.keySet()){
            int count = ht.get(key);
        
            multi_count *= (count + 1);    
        }
        
        answer = multi_count - 1;
        
        return answer;
    }
}