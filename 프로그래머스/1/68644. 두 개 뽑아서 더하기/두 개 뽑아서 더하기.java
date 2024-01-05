import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer_list = new ArrayList<>();
        
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = (i + 1); j < numbers.length; j++) {
                int temp_number = numbers[i] + numbers[j];
                
                if(answer_list.indexOf(temp_number) <= -1)
                    answer_list.add(temp_number);
            }
        }
        
        int[] answer = new int[answer_list.size()];
        
        for(int i = 0; i < answer_list.size(); i++) {
            answer[i] = answer_list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}