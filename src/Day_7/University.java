package Day_7;

public class University {
    static String name;
    static String number;
     static class Department{
         static void displayInfo(String name,String number){
             System.out.println("Faculty name:" + name);
             System.out.println("Number:" + number);
        }
    }

    public static void main(String[] args) {

         /* Calling static class
           outerclass.innerclass.methodname();
          */
        University.Department.displayInfo("Raju Upadhay","7487856852");
    }
}
