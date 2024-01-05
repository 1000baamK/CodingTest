import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        StringBuffer sb = new StringBuffer();
        
        if(str.length()<=10 && n>=1 && n<=5){
            for(int i=0; i<n; i++){
                sb.append(str);
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}