import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] a : intervals){
            
            for(int i=a[0]; i<=a[1]; i++){
                list.add(arr[i]);
            }
        }
        
        
        return list;
    }
}