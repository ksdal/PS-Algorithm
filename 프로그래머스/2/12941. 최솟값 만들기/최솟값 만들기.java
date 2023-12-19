import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        //Integer[] A_2 = Arrays.stream(A).boxed().toArray(Integer[] :: new);
        //Integer[] B_2 = Arrays.stream(B).boxed().toArray(Integer[] :: new);
        Integer[] A_2 = new Integer[A.length];
        Integer[] B_2 = new Integer[B.length];
        
        for(int i = 0; i < A.length; i++){
            A_2[i] = A[i];
            B_2[i] = B[i];
        }

        Arrays.sort(A_2);
        Arrays.sort(B_2, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += A_2[i] * B_2[i];
        }

        return answer;
    }
}