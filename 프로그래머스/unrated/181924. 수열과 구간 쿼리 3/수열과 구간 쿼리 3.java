class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int temp = 0;
		
		for(int i=0; i<queries.length; i++) {
			
			int a = queries[i][0];
			int b = queries[i][1];
			
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
        
        return arr;
    }
}