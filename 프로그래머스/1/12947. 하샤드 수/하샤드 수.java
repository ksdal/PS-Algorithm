class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        long sum = 0;
        String x_string = String.valueOf(x);
        String[] x_string_array = x_string.split("");
        
        for(int i = 0; i < x_string_array.length; i++)
            sum += Long.parseLong(x_string_array[i]);
        
        
        return (x % sum) == 0;
    }
}