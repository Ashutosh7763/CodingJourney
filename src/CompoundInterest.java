import java.io.*;
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        double principal,time,rate,ci;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal amount:");
        principal=sc.nextDouble();
        System.out.println("Enter time:");
        time=sc.nextDouble();
        System.out.println("Enter rate:");
        rate=sc.nextDouble();
        ci=principal * (Math.pow((1+rate/100),time));
        System.out.println("Compound Interest is " + ci);
    }
}
