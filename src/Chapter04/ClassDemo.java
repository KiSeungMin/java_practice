package Chapter04;

class Circle{
    
    private double radius;     // 필드를 외부로부터 은닉
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double r){
        this.radius = r;
    }
    
    double findArea(){
        return 3.14 * radius * radius;
    }
    
    void show(double x, double y){
        System.out.println("반지름 = "  + x + " 넓이 = " + y);
    }
}

public class ClassDemo{
    public static void main(String[] args){
        Circle myCircle =new Circle();
        
        myCircle.setRadius(10.0);
        
        myCircle.show(myCircle.getRadius(), myCircle.findArea());
    }
}