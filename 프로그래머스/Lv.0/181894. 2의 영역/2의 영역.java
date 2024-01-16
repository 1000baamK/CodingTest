import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int startTwoIdx = -1;
        int endTwoIdx = -1;
        
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == 2) {
        		startTwoIdx = i;
        		break;
        	}
        }
        
        if(startTwoIdx != -1) {
        	for(int i=startTwoIdx+1; i<arr.length; i++) {
        		if(arr[i] == 2) {
        			endTwoIdx = i;
        		}
        	}
        	
        	if(endTwoIdx != -1) {
        		for(int i=startTwoIdx; i<=endTwoIdx; i++) {
        			list.add(arr[i]);
        		}
        	}else {
        		list.add(arr[startTwoIdx]);
        	}
        }else {
        	list.add(-1);
        }
        
        return list;
    }
}