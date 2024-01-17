class Solution {
    public int solution(int[] num_list) {
        int result = 1;
        for(int i=0; i<num_list.length; i++){
            if(num_list.length>=11){
                result += num_list[i];
            }else if(num_list.length<=10){
                result *= num_list[i];
            }
        }
        
        if(num_list.length>=11){
            result -= 1;
        }
        
        return result;
    }
}