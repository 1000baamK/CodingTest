class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        sb.append(my_string.substring(0, s));
        
        String reverseStr = new StringBuffer(my_string.substring(s,e+1)).reverse().toString();
        sb.append(reverseStr);
        sb.append(my_string.substring(e+1));
        
        answer = sb.toString();
        
        return answer;
    }
}