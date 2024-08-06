package Day_4;

import java.util.Scanner;

public class HexaToOctal {
   static  int Hex_Decimal(String s){
        String digits="0123456789ABCDEF";
        s=s.toUpperCase();
        int val=0;
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           int d = digits.indexOf(c);
           val = 16 * val + d;
       }
       return val;
    }
    public static void main(String[] args) {
       String hex_Num;
        int r,i=0,j;
        System.out.println("Enter an Hexadecimal number:");
        Scanner sc=new Scanner(System.in);
        hex_Num=sc.next();

        //Calling Hex_Decimal method.....
        int decNum=Hex_Decimal(hex_Num);

        int[] arr =new int[50];
        while(decNum>0){
            r=decNum%8;
            arr[i]=r;
            i++;
            decNum/=8;
        }
        System.out.println("Octal number:");
        for(j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
