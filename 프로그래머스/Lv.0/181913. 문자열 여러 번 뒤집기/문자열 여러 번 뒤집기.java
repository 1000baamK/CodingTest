class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer;
		
		StringBuilder sb = new StringBuilder();

	    for (int[] q : queries) {
	        int start = q[0];
	        int end = q[1];

	        String reverseStr = new StringBuilder(my_string.substring(start, end + 1)).reverse().toString();

	        sb.append(my_string.substring(0, start));
	        sb.append(reverseStr);
	        sb.append(my_string.substring(end + 1));
	        
	        my_string = sb.toString();
            
	        sb.setLength(0);
	    }
		
		answer = my_string;
        
        return answer;
    }
}