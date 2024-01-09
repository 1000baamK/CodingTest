import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> stk = new ArrayList<>();
		
        for(int i=0; i<arr.length;) {
        	
        	if(stk.isEmpty()) {
        		stk.add(arr[i++]);
        	}else if(!stk.isEmpty() && (stk.get(stk.size()-1) < arr[i])){
        		stk.add(arr[i++]);
        	}else if(!stk.isEmpty() && (stk.get(stk.size()-1) >= arr[i])) {
        		stk.remove(stk.size()-1);
        	}
        }
        
        answer = new int[stk.size()];
        
        for(int i=0; i<stk.size(); i++){
            answer[i] = stk.get(i);
        }
        
        return answer;
    }
}