public class Dog {
      String name,color;
      Dog(String name,String color){
         this.name=name;
         this.color=color;
      }

    public static void main(String[] args) {
          Dog dg=new Dog("Tommy","brown");
        System.out.println("Dog Name:" + dg.name);
        System.out.println("Dog Color:" + dg.color);
    }
}
