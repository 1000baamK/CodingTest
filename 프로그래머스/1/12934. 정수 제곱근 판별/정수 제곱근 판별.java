class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double a = Math.floor(Math.pow(n, 0.5));
        double b = Math.ceil(Math.pow(n, 0.5));
        
        if(a == b){
            answer = (long)Math.pow(a+1, 2);
        }else{
            answer = -1L;
        }
        
        return answer;
    }
}