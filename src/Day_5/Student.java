package Day_5;

public class Student {
    String name,grade;

    Student(String name,String grade){
        this.name=name;
        this.grade=grade;
    }

     String getName(){
        return name;
     }

     String getGrade(){
        return grade;
     }

     void setName(String name){
        this.name=name;
     }

     void setGrade(String grade){
        this.grade=grade;
     }


    public static void main(String[] args) {
        Student student=new Student("ashutosh","A+");

        System.out.println("Name:" + student.getName());
        System.out.println("Grade" + student.getGrade());
    }
}
