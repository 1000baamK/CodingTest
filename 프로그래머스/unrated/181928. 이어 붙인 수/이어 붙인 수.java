class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String num1 = "0";
        String num2 = "0";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 1){
                num1 += String.valueOf(num_list[i]);
            }else{
                num2 += String.valueOf(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(num1)+Integer.parseInt(num2);
        
        
        return answer;
    }
}