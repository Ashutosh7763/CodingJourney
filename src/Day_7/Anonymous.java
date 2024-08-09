package Day_7;

interface Greeting {
    void sayHello();
}
    public class Anonymous{

        public static void main(String[] args) {

            //Anonymous class created....
           Greeting greeting=new Greeting() {
               @Override
               public void sayHello() {
                   System.out.println("Hello World!");
               }
           };
           greeting.sayHello();
        }
    }
