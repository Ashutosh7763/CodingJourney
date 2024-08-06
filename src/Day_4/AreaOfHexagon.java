package Day_4;

import java.util.Scanner;

public class AreaOfHexagon{
    static double hexagonArea(double s){
        return (6*s*s)/(4*Math.tan(Math.PI/6));
    }

    public static void main(String[] args) {
        double s;
        System.out.println("Enter length of a side");
        Scanner sc=new Scanner(System.in);
        s=sc.nextDouble();
        System.out.println("Area of Hexagon:"+hexagonArea(s));
    }
}
