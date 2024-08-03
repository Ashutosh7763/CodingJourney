import java.util.Scanner;
public class PowerOfNo {
    public static void main(String[] args) {
        int base,exp,result=1;
        System.out.println("Enter base:");
        Scanner num=new Scanner(System.in);
        base=num.nextInt();
        System.out.println("Enter exponent");
        Scanner num1=new Scanner(System.in);
        exp=num1.nextInt();
        while(exp!=0)
        {
           result*=base;
           exp--;
        }
        System.out.println("Result=" + result);
    }
}
