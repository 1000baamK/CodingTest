class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<code.length(); i++){
            if(i%q == r){
                sb.append(code.charAt(i));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}