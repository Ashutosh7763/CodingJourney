import java.util.Scanner;
public class Fibonacci {
    static int fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number:");
        Scanner num1=new Scanner(System.in);
        num=num1.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print(fib(i)+ " ");
        }
    }
}
