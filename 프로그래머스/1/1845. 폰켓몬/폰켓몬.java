import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int select_ramain_count = 0;
        int type_count = 0;
        List<Integer> type_list = new ArrayList<>();
        
        for(int item : nums) {
            if(type_list.indexOf(item) == -1)
                type_list.add(item);
        }
        
        select_ramain_count = nums.length / 2;
        type_count = type_list.size();
        return select_ramain_count > type_count ? type_count : select_ramain_count;
    }
}