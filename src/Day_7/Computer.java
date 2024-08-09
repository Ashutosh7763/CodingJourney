package Day_7;

  public class Computer {
     static String brand,speed;
      class Processor {
         void displayDetails() {
            brand = "Intel 8086";
            speed = "2.4 Ghz";
            System.out.println("Brand:" + brand);
            System.out.println("Speed:" + speed);
        }
    }

        public static void main(String[] args) {

         /*How to call create inner class object...
            //Outerclass_Name.innerclass_name = outerclass.innerclass;*/

        Computer.Processor computer=new Computer().new Processor();
            computer.displayDetails();
        }
}
