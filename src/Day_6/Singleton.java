package Day_6;

public class Singleton {

    //Singleton is a class which create only one object...All instances refer same memory location....
    public static Singleton singleInstance=null;
   private Singleton(){
        System.out.println("Instance is created");
    }
    public static Singleton getInstance(){
         if(singleInstance==null){
             singleInstance=new Singleton();
         }
         return singleInstance;
    }

    public static void main(String[] args) {
      //Static method will call easily by class.....
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();

        if(instance1==instance2){
            System.out.println("Both instance memory are same");
        }
        else{
            System.out.println("Both instance are different");
        }

    }
}
