import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        String[] arr = myString.split("x", -1);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String a : arr){
            list.add(a.length());
        }
        
        return list;
    }
}