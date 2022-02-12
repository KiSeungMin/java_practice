package Chapter04;

class Circle{
    
    double radius;
    String color;
    
    // 생성자
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    // 생성자 오버로딩, this를 통해 기존 생성자를 호출한다.
    public Circle(double radius){
        this(radius, "파랑");        // this()는 반드시 생성자의 첫 행에 위치해야 한다.
    }
    
    
    public Circle(String color){
        this(10.0, color);
    }
    
    public Circle(){
        this(10.0, "빨강");
    }
}

public class ClassDemo2{
    
    public static void main(String[] args){
        
        Circle myCircle = new Circle(10.0, "RED");
    }
}
