import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> nums_list = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = (i + 1); j < nums.length -1; j++) {
                for (int k = (j + 1); k < nums.length; k++) {
                    nums_list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        
        
        for(int item : nums_list) {
            System.out.println("item : " + item);
            for(int i = 2; i <= item; i++){
                if(item == i){
                    answer++;
                    break;
                }
                
                if((item % i) == 0)
                    break;
            }
        }

        return answer;
    }
}