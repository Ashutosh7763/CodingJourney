public class SumOfBinaryNo {
    public static void main(String[] args) {

        long b1 = 111101, b2 = 110010;
        int i = 0, carry = 0;
        int sum[] = new int[30];

        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }

        if(carry!=0){
            sum[i++]=carry;
        }

        while(i>=0){
            System.out.println(sum[i--]);
        }
        System.out.print("\n");
    }
}

