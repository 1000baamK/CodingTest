class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer;
        
        char[] cArr = my_string.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<index_list.length; i++) {
			sb.append(cArr[index_list[i]]);
		}
        
        answer = sb.toString();
        
        return answer;
    }
}