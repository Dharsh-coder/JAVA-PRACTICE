package looping.basic;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    // int a2000=0, a500=0, a200=0, a100=0, a50=0, a20=0, a10=0, a5=0, a2=0, a1=0, total=0;

    // if(amt<0){
    //     System.out.println("Should  be positive!");
    // }else if(amt ==0 ){
    //     System.out.println("No currency needed");
    // }else{
    //     while(amt>0){
    //         if(amt>=2000){
    //             amt-=2000;
    //             a2000++;
    //             total++;
    //         }
    //         else if(amt>=500){
    //             amt-=500;
    //             a500++;
    //             total++;
    //         }else if(amt>=200){
    //             amt-=200;
    //             a200++;
    //             total++;
    //         }
    //         else if(amt>=100){
    //             amt-=100;
    //             a100++;
    //             total++;
    //         }else if(amt>=50){
    //             amt-=50;
    //             a50++;
    //             total++;
    //         }else if(amt>=20){
    //             amt-=20;
    //             a20++;
    //             total++;
    //         }else if(amt>=10){
    //             amt-=10;
    //             a10++;
    //             total++;
    //         }else if(amt>=5){
    //             amt-=5;
    //             a5++;
    //             total++;
    //         }else if(amt>=2){
    //             amt-=2;
    //             a2++;
    //             total++;
    //         }else{
    //             amt-=1;
    //             a1++;
    //             total++;
    //         }
    //     }
    //     if(a2000>0){
    //         System.out.println("2000: "+ a2000);
    //     }
    //     if(a500>0){
    //         System.out.println("500: "+a500);
    //     }if(a200>0){
    //         System.out.println("200: "+ a200);
    //     }
    //     if(a100>0){
    //         System.out.println("100: "+a100);
    //     }
    //     if(a50>0){
    //         System.out.println("50: "+a50);
                
    //     }if(a20>0){
    //         System.out.println("20: "+a20);
    //     }if(a10>0){
    //         System.out.println("10: "+ a10);
    //     }if(a5>0){
    //         System.out.println("5: "+a5);
    //     }if(a2>0){
    //         System.out.println("2: "+a2);
    //     }if(a1>0){
    //         System.out.println("1: "+a1);
    //     }
    //     System.out.println("Total notes: "+ total);
    // }



    int[] currencies = {2000,500,200,100,50,20,10,5,2,1};
    int[] noteCount = new int[currencies.length];
    int amt = amount;
    int total =0;
    for(int i=0;i<currencies.length;i++){
        if(amt>=currencies[i]){
            noteCount[i]=amt/currencies[i];
            amt = amt%currencies[i];
            total += noteCount[i];
        }
    }
    for(int i=0;i<currencies.length;i++){
        if(noteCount[i]>0){
            System.out.println("Amount "+currencies[i]+" : "+noteCount[i]);
        }
    }
    System.out.println(total);
    sc.close();
}
}
