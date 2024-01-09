import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] new_priorities = Arrays.copyOf(priorities, priorities.length);
        
        Arrays.sort(new_priorities);
        Stack<Integer> count_stack = new Stack<>();
        Queue<QueueItem> queue = new LinkedList<>();
        
        for(int item : new_priorities)
            count_stack.add(item);
        
        for(int i = 0; i < priorities.length; i++) {
            QueueItem queueItem = new QueueItem();
            queueItem.item = priorities[i];
            
            if(i == location)
                queueItem.flag = true;
            
            queue.add(queueItem);
        }
        
        while(queue.size() != 0) {
            int count_number = count_stack.peek();
            System.out.println("count_number : " + count_number);
            QueueItem queueItem = queue.poll();
           
            System.out.println("queueItem.item : " + queueItem.item + " / " + "queueItem.flag : " + queueItem.flag);
            if(queueItem.item == count_number){
                count_stack.pop();
                answer++;
                
                if(queueItem.flag)
                    break;
            } else {
                queue.add(queueItem);
            }
        }
        
        return answer;
    }
}

class QueueItem {
    int item;
    boolean flag = false;
}