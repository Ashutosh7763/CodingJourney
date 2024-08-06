package Day_4;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String email,password,emailVerify,passVerify;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Email:");
        email=sc.nextLine();
        System.out.println("Enter Password:");
        password=sc.nextLine();
        if(email==""){
            if(password==""){
                System.out.println("Please enter Email and Password");
            }
        }
        System.out.println(" *---Login Now---*");
        System.out.println("Enter Email");
        emailVerify=sc.nextLine();
        System.out.println("Enter Password");
        passVerify=sc.nextLine();
        if(email.equals(emailVerify)){
            if(password.equals(passVerify)){
                System.out.println("Login Successfull");
            } else if (passVerify=="") {
                System.out.println(" Please enter password");
            } else{
                System.out.println("Invalid Password");
            }
        }
        if(emailVerify==""){
            if(passVerify==""){
                System.out.println("Please enter Email and Password");
            }
        }
        else if(emailVerify==""){
            System.out.println("Please enter email");
        }
//        else{
//            System.out.println("Invalid Email");
//            }
    }
}
