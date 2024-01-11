class Solution {
    public int solution(String number) {
        int answer;
		char[] numArr = number.toCharArray();
		int sum = 0;
		
		for(char num : numArr) {
			sum += Character.getNumericValue(num);
		}
		
		answer = sum%9;
        
        return answer;
    }
}