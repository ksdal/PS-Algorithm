import java.util.*;


class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        
        PriorityQueue<Integer> max_queue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min_queue = new PriorityQueue<>();
   
        int max_delete_count = 0;
        int min_delete_count = 0;
        for(String item : operations) {
            if(item.equals("D 1")) {
                max_queue.poll();
                max_delete_count++;
            } else if(item.equals("D -1")) {
                min_queue.poll();
                min_delete_count++;
            } else {
                String[] split_item = item.split(" ");
                int input_number = Integer.parseInt(split_item[1]);
                
                max_queue.add(input_number);
                min_queue.add(input_number);
            }        
            
            if(max_queue.size() == 0 || min_queue.size() == 0){
                max_queue.clear();
                min_queue.clear();
            }
            
            if(max_delete_count != 0 && min_delete_count != 0)
                if(max_delete_count == min_delete_count){
                    max_queue.clear();
                    min_queue.clear();
                    
                    max_delete_count = 0;
                    min_delete_count = 0;
                }
                
            
        }
        
        answer = new int[] { max_queue.isEmpty() ? 0 : max_queue.poll(), min_queue.isEmpty() ? 0 : min_queue.poll() };
        
        return answer;
    }
}