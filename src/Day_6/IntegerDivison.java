package Day_6;

import java.util.Scanner;

public class IntegerDivison {
    public static void main(String[] args) {
        float thoeoryMarks,practicalMarks,totalMarks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Theory Marks:");
        thoeoryMarks=sc.nextFloat();
        System.out.println("Enter Practical Marks:");
        practicalMarks=sc.nextFloat();
        System.out.println("Enter Total Marks");
        totalMarks=sc.nextFloat();
        float percentage=((thoeoryMarks + practicalMarks) * 100)/totalMarks;
        int round = Math.round(percentage);

        System.out.print("Percentage=" + round + "%");

    }
}
