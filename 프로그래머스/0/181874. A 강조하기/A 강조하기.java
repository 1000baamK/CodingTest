class Solution {
    public String solution(String myString) {
        myString = myString.replace("a", "A");
		
		char[] cArr = myString.toCharArray();
		for(int i=0; i<myString.length(); i++) {
			if(Character.isUpperCase(cArr[i]) && cArr[i] != 'A') {
				cArr[i] = Character.toLowerCase(cArr[i]);
			}
		}
        
        return String.valueOf(cArr);
    }
}