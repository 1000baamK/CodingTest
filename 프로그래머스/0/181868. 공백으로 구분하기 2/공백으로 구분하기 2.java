import java.util.*;
class Solution {
    public List<String> solution(String my_string) {
        
        List<String> list = new ArrayList<>();
        String[] arr = my_string.split(" ");
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                list.add(arr[i]);
            }
        }
        
        return list;
    }
}