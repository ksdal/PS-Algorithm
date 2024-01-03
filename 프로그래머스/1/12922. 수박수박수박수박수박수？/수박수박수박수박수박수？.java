class Solution {
    public String solution(int n) {
        boolean flag = true;
        String answer = "";
        
        for(int i = 0; i < n; i++){
            if(flag) answer += "수";
            else answer += "박";
            
            flag = !flag;
        }
        
        return answer;
    }
}