package Day_6;

public class FractionalPart {

    public static void main(String[] args) {
        double num=45.87;
        double fractional = num%1;
        double integral = num - fractional;
        System.out.println("Original number:" + num);
        System.out.println("Integral Part:" + integral );
        System.out.println("Fractional Part:" + fractional);
    }
}
