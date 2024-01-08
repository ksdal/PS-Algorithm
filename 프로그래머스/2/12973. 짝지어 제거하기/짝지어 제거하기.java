import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> s_stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s_stack.isEmpty()){
                s_stack.add(String.valueOf(s.charAt(i)));
                continue;
            }
            
            if(String.valueOf(s.charAt(i)).equals(s_stack.peek()))
                s_stack.pop();
            else
                s_stack.add(String.valueOf(s.charAt(i)));
        }

        return s_stack.isEmpty() ? 1 : 0;
    }
    
    
}