public class Cat {
        String name;
        Integer age;
         Cat(){
            this.name="Unknown";
            this.age=0;
        }

    public static void main(String[] args) {
            Cat obj=new Cat();
            System.out.println("Name:" + obj.name);
            System.out.println("Age:" + obj.age);
    }
}
