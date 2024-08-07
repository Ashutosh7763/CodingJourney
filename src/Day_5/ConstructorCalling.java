package Day_5;

public class ConstructorCalling {
    String name,course;
    ConstructorCalling(){
        this("ashutosh","BCA");
    }
    ConstructorCalling(String name,String course){
        this.name=name;
        this.course=course;
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Course:" + course);
    }

    public static void main(String[] args) {
        ConstructorCalling calling=new ConstructorCalling();
        calling.display();
    }
}
