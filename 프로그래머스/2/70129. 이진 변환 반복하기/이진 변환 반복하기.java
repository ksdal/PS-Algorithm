class Solution {
    public int[] solution(String s) {
        int removed_zero_count = 0;
        int routine_count = 0;
        String target_string = s;
        
        while(true) {
            if(target_string.equals("1"))
                break;
            
            String modify_target_string = "";
            for(int i = 0; i < target_string.length(); i++) {
                if(target_string.charAt(i) == '0')
                    removed_zero_count++;
                else
                    modify_target_string += String.valueOf(target_string.charAt(i));
            }
            
            modify_target_string = String.format(Integer.toBinaryString(modify_target_string.length()));
            
            target_string = modify_target_string;
            routine_count++;
        }
        
        return new int[] { routine_count, removed_zero_count };
    }
}