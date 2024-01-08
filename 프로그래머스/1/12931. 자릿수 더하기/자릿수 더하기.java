import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numStr = String.valueOf(n);
        
        for(int i=0; i<numStr.length(); i++){
            answer += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }

        return answer;
    }
}