package Day_6;

public class Classroom {

    String className;
      String[] students;
     Classroom(String className, String[] students){
      this.className=className;
      this.students=students;
     }

     void display(){
         System.out.println("ClassName:" + className);
         System.out.println("Students Name:");
         for(String student:students){
             System.out.print(student + " ");
         }
         System.out.println();
     }


    public static void main(String[] args) {
        String[] students ={"Ashutosh","Shashikant","Prashant","Vikram","Sukhnandan","Sunny"};
        Classroom classroom= new Classroom("Bca-PPU-3rd year-B2", students);
        classroom.display();

    }

}
