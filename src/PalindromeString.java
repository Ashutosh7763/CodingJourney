import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        String str,str1,rev="";
        System.out.println("Enter string:");
        Scanner sc=new Scanner(System.in);
        str=(sc.nextLine());
        str1=str.toUpperCase(); //Convert to Uppercase
        for(int i= str1.length()-1;i>=0;i--)
        {
             rev=rev+str1.charAt(i);
        }
        String reverse=rev.toUpperCase();//Convert to Uppercase
        if(str1.equals(reverse))
        {
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome String");
        }
    }
}
