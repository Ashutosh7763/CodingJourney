import java.util.Scanner;
public class DecimalToHexa {
    public static void main(String[] args) {
        int n,r,i=0,j;
        System.out.println("Enter any decimal number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[40];
        while(n>0)
        {
            r=n%16;
            arr[i]=r;
            i++;
            n=n/16;
        }
        System.out.println("Hexadecimal number=");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
    }
}
