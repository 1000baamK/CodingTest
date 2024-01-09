class Solution {
    public int[] solution(int l, int r) {
        
        int[] answer;
        int cnt = 0;
        int index = 0;
        
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                cnt++;
            }
        }

        if (cnt == 0) {
            return new int[]{-1};
        }else{
            answer = new int[cnt];
        }
        
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                answer[index++] = i;
            }
        }

        return answer;
    }
}