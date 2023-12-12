import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String n_string = String.valueOf(n);
        String[] n_string_array = n_string.split("");
        long[] n_array = new long[n_string_array.length];
        
        for(int i = 0; i < n_string_array.length; i++)
            n_array[i] = Long.parseLong(n_string_array[i]);
        
        Arrays.sort(n_array);
        
        n_string = "";
        for(int i = n_array.length - 1; i >= 0 ; i--)
            n_string += String.valueOf(n_array[i]);
            
            
        return Long.parseLong(n_string);
    }
}