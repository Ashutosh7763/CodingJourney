package Day_7;

public class Car {
       String make,model;
       Integer year;

       Car(String make,String model,Integer year){
           if(make.isEmpty() || make==null){
               this.make="unknown";
           }
           else{
               this.make=make;
           }
           if(model.isEmpty() || model==null){
               this.model="Mujhe Nahi Pata Hai..";
           }
           else{
               this.model=model;
           }
           if(year<=0){
               this.year=1992;
           }
           else{
               this.year=year;
           }
       }

    public static void main(String[] args) {
        Car car=new Car("Tata","suv",2023);
        System.out.println("Car make by :" + car.make);
        System.out.println("Model Number is :" + car.model);
        System.out.println("Year of Manufacture :" + car.year);

        Car car1 = new Car("","",-1);
        System.out.println("Car make by:" + car1.make);
        System.out.println("Model Number is :" + car1.model);
        System.out.println("Year of Manufacture :" + car1.year);

    }
}
