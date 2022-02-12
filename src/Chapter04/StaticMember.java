package Chapter04;

class Circle{
    
    double radius;
    static int numOfCircles = 0;        // 정적 변수
    int numCircles = 0;
        
    public Circle(double radius){
        this.radius = radius;
        numOfCircles ++;
        numCircles++;
    }
}

class Util{
    static int fourTimes(int i){
        return i * 4;
    }
}

public class StaticMember{
    
    // main 메서드는 대표적인 정적 메서드이다.
    
    public static void main(String[] args){
        Circle myCircle= new Circle(10.0);
        Circle yourCircle = new Circle(5.0);
        
        System.out.println("원의 개수 : " + Circle.numOfCircles);
        System.out.println("원의개수 : " + yourCircle.numCircles);
        
        // 정적 메서드 호출
        System.out.println(Util.fourTimes(5));
    }
    
    void print(){
        System.out.println("인스턴스 메서드입니다.");
    }
}


