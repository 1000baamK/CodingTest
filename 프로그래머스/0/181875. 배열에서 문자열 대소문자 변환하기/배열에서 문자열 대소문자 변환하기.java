import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(i%2 == 0){
                list.add(strArr[i].toLowerCase());
            }else{
                list.add(strArr[i].toUpperCase());
            }
        }
        return list;
    }
}