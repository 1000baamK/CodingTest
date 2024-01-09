class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
		int cnt = 0;
		
		for(int[]q : queries) {
			
			int temp = -1;
			
			for(int i=q[0]; i<=q[1]; i++) {
				if(arr[i] > q[2]) {
					if((temp == -1) || (arr[i] < temp)) {
						temp = arr[i];
						System.out.println(i);
					}
				}
			}
			answer[cnt++] = temp;
		}
        
        return answer;
    }
}