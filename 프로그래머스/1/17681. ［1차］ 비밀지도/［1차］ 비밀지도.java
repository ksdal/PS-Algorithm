import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        List<Integer> calc_result_list = new ArrayList<>();
        
        for(int i = 0; i < n; i++)
            calc_result_list.add(arr1[i] | arr2[i]);
        
        int index = 0;
        for(Integer item : calc_result_list){
            String element = "";
            for(int i = n - 1; i >= 0; i--){
                int divisionNum = (int) Math.pow(2, i);
                
                if(item >= divisionNum){
                    element += "#";
                    item -= divisionNum;
                }
                else
                    element += " ";
            }
            
            answer[index] = element;
            index++;
        }
        
        return answer;
    }
}