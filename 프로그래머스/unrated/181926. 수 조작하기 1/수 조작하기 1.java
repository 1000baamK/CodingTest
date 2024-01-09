class Solution {
    public int solution(int n, String control) {
        
        char[] con = control.toCharArray();
        
        for(char c : con){
            switch(c){
                case 'w' : n++;
                    continue;
                case 's' : n--;
                    continue;
                case 'd' : n+=10;
                    continue;
                case 'a' : n-=10;
                    continue;
            }
        }
        
        return n;
    }
}