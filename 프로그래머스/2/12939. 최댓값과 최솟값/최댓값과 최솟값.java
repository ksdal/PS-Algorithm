import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] sArray = s.split(" ");
        int[] sIntArray = new int[sArray.length];
        
        for(int i = 0; i < sArray.length; i++){
            sIntArray[i] = Integer.parseInt(sArray[i]);
        }
        
        Arrays.sort(sIntArray);
        
        return sIntArray[0] + " " + sIntArray[sIntArray.length - 1];
    }
}