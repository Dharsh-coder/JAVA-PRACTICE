package string;


import java.util.Scanner;


public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String longest = " ";
        for(int i=0;i<str.length();i++){
            
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
                
            }
            if(ch==' ' || i==str.length()-1){
                if(longest.length()<= sb.length()){
                    longest = sb.toString();
                    sb.delete(0, sb.length());
                }else{
                    sb.delete(0, sb.length());
                }
            }
        }
        System.out.println(longest);

        
        sc.close();
    }
}
