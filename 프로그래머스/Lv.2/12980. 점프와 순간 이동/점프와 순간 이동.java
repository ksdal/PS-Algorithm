import java.util.*;

public class Solution {
    public int solution(int n) {
        int target = n;
        int ans = 0;

        while(true) {
            if(target == 0)
                break;
            
            if(( target % 2 ) == 0)
                target = target / 2;
            else {
                ans++;
                target--;
            }       
        }       

        return ans;
    }
}