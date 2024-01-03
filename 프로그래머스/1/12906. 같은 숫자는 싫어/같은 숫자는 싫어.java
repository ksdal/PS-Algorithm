import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int lastNumber = -1;
        
        for(int item : arr) {
            if(queue.size() == 0){
                queue.offer(item);
                lastNumber = item;
            }
            else {
                if(lastNumber != item){
                    queue.offer(item);
                    lastNumber = item;
                }
            }
        }
    
        int[] answer = new int[queue.size()];
        int index = 0;
        
        while(!queue.isEmpty()){
            answer[index] = queue.poll();
            index++;
        }

        return answer;
    }
}