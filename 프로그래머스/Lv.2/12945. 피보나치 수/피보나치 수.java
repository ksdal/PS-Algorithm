class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = method(0, 1, 2, n);
        return answer;
    }
    
    public int method(int first_num, int second_num, int now_count, int target_count){
        if(now_count == target_count)
            return (first_num + second_num) % 1234567;
        else {
            int new_first_num = second_num  % 1234567;
            int new_second_num = (first_num + second_num)  % 1234567;
            int new_now_count = now_count + 1;
            return method(new_first_num, new_second_num, new_now_count, target_count);
        }
            
    }
}