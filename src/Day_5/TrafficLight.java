package Day_5;

 public class TrafficLight {
     static String color;
    static Integer duration;
    TrafficLight(String color,Integer duration){
        this.color =color;
        this.duration=duration;
    }

    static boolean isRed(){
       return color.equals("red");
    }

    static boolean isgreen(){
        return color.equals("green");
    }

    void changeColor(String newColor){
         color=newColor;
    }
    static int getDuration(){
        return duration;
    }
    void setDuration(int duration){
        this.duration=duration;
    }

    public static void main(String[] args) {
        TrafficLight light=new TrafficLight("red",12);
        //Check light is red....
        System.out.println("Color is red:" + isRed());
        //Check light is green....
        System.out.println("Color is green:" + isgreen());
        light.changeColor("green");

        System.out.println("Color is green:" + isgreen());
        System.out.println("Duration:" + getDuration());

        light.setDuration(20);
        System.out.println("Duration:" + getDuration());
    }
}
