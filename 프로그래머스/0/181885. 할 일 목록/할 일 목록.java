import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<todo_list.length; i++) {
			if(finished[i] != true) {
				list.add(todo_list[i]);
			}
		}
        return list;
    }
}