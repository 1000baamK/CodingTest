class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        int s;
		int e;
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<my_strings.length; i++) {
			
			s = parts[i][0];
			e = parts[i][1];
			
			sb.append(my_strings[i].substring(s,e+1));
		}
        
        answer = sb.toString();
        return answer;
    }
}