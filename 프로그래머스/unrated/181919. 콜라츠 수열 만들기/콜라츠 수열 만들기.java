import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(n);
        
        while(n != 1){
            if(n%2 == 0){
                numList.add(n /= 2);
            }else{
                numList.add(n = 3*n+1);
            }
        }
        
        answer = new int[numList.size()];
        
        for(int i=0; i<numList.size(); i++){
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}