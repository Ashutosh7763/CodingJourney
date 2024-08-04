public class NumToWord{
    public static void main(String args[]) {
        digitToWord("1234".toCharArray());
        digitToWord("557".toCharArray());
        digitToWord("45".toCharArray());
        digitToWord("2".toCharArray());
        digitToWord("0".toCharArray());
        digitToWord("801".toCharArray());
        digitToWord("54312".toCharArray());
        //passing empty string
        digitToWord("".toCharArray());
    }
    static void digitToWord(char n[]) {
        int len = n.length;
        if (len == 0) {
            System.out.println("Empty string.");
            return;
        }
        if (len > 4) {
            System.out.print(String.valueOf(n) + ": ");
            System.out.println("The number you have entered has more than four digits.");
            return;
        }
        String[] unitPlaceDig = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tensPlaceDig = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tensMultiplier = new String[] {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powOfTens = new String[] {"Hundred", "Thousand"};
        System.out.print(String.valueOf(n) + ": ");
        if (len == 1){
            System.out.println(unitPlaceDig[n[0]-'0']);
            return;
        }
        int p = 0;
        while (p < n.length) {
            if (len >= 3){
                if (n[p] - '0' != 0) {
                    System.out.print(unitPlaceDig[n[p] - '0'] + " ");
                    System.out.print(powOfTens[len - 3]+ " ");
                }
                --len;
            }
            else {
                if (n[p] - '0' == 1) {
                    int sum = n[p] - '0' + n[p + 1] - '0';
                    System.out.println(tensPlaceDig[sum]);
                    return;
                }
                else if (n[p] - '0' == 2 && n[p + 1] - '0' == 0) {
                    System.out.println("Twenty");
                    return;
                }
                else {
                    int i = (n[p] - '0');
                    if (i > 0)
                        System.out.print(tensMultiplier[i]+ " ");
                    else
                        System.out.print("");
                    ++p;
                    if (n[p] - '0' != 0)
                        System.out.println(unitPlaceDig[n[p] - '0']);
                }
            }
            ++p;
        }
    }
}