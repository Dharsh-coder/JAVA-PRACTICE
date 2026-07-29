package string;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] visited = new boolean[str.length()]; 

        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++){
                
                if(ch == str.charAt(j)){
                    if(visited[j]==false){
                        visited[j]=true;
                        count++;
                    }else{
                        break;
                    }

                    
                }
            }
            if(count!=0){
                System.out.println(ch+" : "+count);
            }
        }
        
        sc.close();
    }
}
