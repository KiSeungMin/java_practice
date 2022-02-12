package Chapter07;

public interface Controllable{
    
    default void repair(){
        show("장비를 수리한다.");
    }
    
    static void reset(){
        System.out.println("장비를 초기화한다.");
    }
    
    static void show(String s){
        System.out.println(s);
    }
    
    // 추상 메서드
    void turnOn();
    void turnOff();
}