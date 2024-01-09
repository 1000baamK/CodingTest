class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<numLog.length-1; i++){
            switch(numLog[i+1] - numLog[i]){
                case 1 : sb.append("w");
                    continue;
                case -1 : sb.append("s");
                    continue;
                case 10 : sb.append("d");
                    continue;
                case -10 : sb.append("a");
                    continue;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}