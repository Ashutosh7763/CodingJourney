package Day_6;

public class Point {
    public  int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    Point(double x,double y){
        this.x=(int)x;
        this.y=(int)y;
    }
    void display(){
        System.out.println("Value of x is:" + x);
        System.out.println("Value of y is " + y);
    }

    public static void main(String[] args) {
    Point point = new Point(12,45);
    Point point1 = new Point(12.24,32.45);
    point.display();
    point1.display();
    }
}
