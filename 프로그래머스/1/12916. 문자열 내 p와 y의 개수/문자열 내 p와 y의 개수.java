class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String ignoreCaseS = s.toUpperCase();
        int count = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(String.valueOf(ignoreCaseS.charAt(i)).equals("P"))
                count++;
            if(String.valueOf(ignoreCaseS.charAt(i)).equals("Y"))
                count--;
        }

        return (count == 0) ? true : false;
    }
}