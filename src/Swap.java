import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter first number:");
        Scanner num1=new Scanner(System.in);
        n1=num1.nextInt();
        System.out.println("Enter second number:");
        Scanner num2=new Scanner(System.in);
        n2=num1.nextInt();
        System.out.println("No. before swapping:" + "n1=" + n1 + " n2=" + n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("No. after swapping:" + "n1=" + n1 + " n2=" + n2);
    }
}
