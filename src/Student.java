public class Student {
    String st_Id,st_Name,grade;

    Student(){
        this("8975","Shashi","A+");
    }

    Student(String st_Id,String st_Name,String grade){
        this.st_Id=st_Id;
        this.st_Name=st_Name;
        this.grade=grade;
    }
    public static void main(String[] args) {
        Student student1=new Student();
        System.out.println("Student Id :" + student1.st_Id);
        System.out.println("Student Name :" + student1.st_Name);
        System.out.println("Grade :" + student1.grade);

        Student student2=new Student("9713","Ashutosh","A+");
        System.out.println("Student Id :" + student2.st_Id);
        System.out.println("Student Name :" + student2.st_Name);
        System.out.println("Grade :" + student2.grade);
    }
}
