package Chapter07;

/*
추상 클래스는 인스턴스를 생성할 수 없고 오직 상속을 통한 자식 클래스를 구현한 후에 인스턴스를 생성할 수 있는 클래스를 말한다.

추상 메서드는 무엇을 할지는 선언하지만, 어떻게 할지는 구현하지않은 메서드를 말한다.
*/


// 추상 클래스는 앞에 abstract 키워드를 붙인다.
abstract class Shape{
    
    double pi = 3.14;
    
    abstract void draw();
    
    public double findArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    
    int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    // 추상 클래스의 메서드는 반드시 자식 클래스에서 구현해야 한다.
    public void draw(){
        System.out.println("원을 그리다.");
    }
    
    // 부모 클래서의 메서드 오버라이딩
    public double findArea(){
        return pi*radius*radius;
    }
}