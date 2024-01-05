import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        StringBuffer sb = new StringBuffer();
        String[] strArr = a.split(" ");
        
        for(int i=0; i<strArr.length; i++){
            sb.append(strArr[i]);
        }
        
        System.out.println(sb.toString());        
        
        sc.close();
    }
}