package Day_4;
import java.util.Scanner;
public class EvenOddCount {

    public static void main(String[] args) {
        int arr1[]=new int[5];
        int i;
        System.out.println("Enter number:");
        for(i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            arr1[i]=sc.nextInt();
        }
    int even=0,odd=0;
    for(i=0;i<5;i++){
        if(arr1[i]%2==0){
            even+=1;
        }
        else{
            odd+=1;
        }
    }
        System.out.println("Total Even no.:"+ even);
        System.out.println("Total Odd no.:" + odd);
    }
}
