class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int max_width = (brown / 2);
        int min_height = 2;
        
        while(true) {
            int yellow_width = max_width - 2;
            int yellow_height = min_height - 2;
            
            if((yellow_width * yellow_height) == yellow){
                answer = new int[] { max_width,  min_height };
                break;
            } else {
                max_width--;
                min_height++;
            }
        }
        
        return answer;
    }
}