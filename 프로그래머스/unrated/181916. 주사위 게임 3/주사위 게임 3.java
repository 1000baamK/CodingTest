import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] dice = {a,b,c,d};
		Arrays.sort(dice);
		
		int p = 0;
		int q = 0;
		int r = 0;
		
		if(dice[0] == dice[3]) {
			answer = 1111*dice[0];
		}else if((dice[0] == dice[2]) || (dice[1] == dice[3])) {
			p = (dice[0] == dice[2]) ? dice[0] : dice[3];
			q = (dice[0] == dice[2]) ? dice[3] : dice[0];
			
			answer = (int) Math.pow((10*p+q), 2);
		}else if((dice[0] == dice[1]) && (dice[2] == dice[3])){
			p = dice[0];
			q = dice[2];
			
			answer = (p+q)*Math.abs(p-q);
		}else if((dice[0] == dice[1]) || (dice[1] == dice[2]) || (dice[2] == dice[3])) {
			if(dice[0] == dice[1]) {
				p = dice[0];
				q = dice[2];
				r = dice[3];
			}else if((dice[1] == dice[2])) {
				p = dice[1];
				q = dice[0];
				r = dice[3];
			}else if((dice[2] == dice[3])) {
				p = dice[2];
				q = dice[0];
				r = dice[1];
			}
			
			answer = q*r;
		}else {
			answer = dice[0];
		}
        
        return answer;
    }
}