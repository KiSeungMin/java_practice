package Chapter04;

class Person{
    
    String name;
    int age;
    
    public Person setName(String name){
        
        this.name = name;
        return this;        // 메서드 체이닝을 위해 생성된 객체 자신을 반환
    }
    
    public Person setAge(int age){
        this.age= age;
        return this;        
    }
    
    public void sayHello(){
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야." );
    }
}

public class MethodChaining{
    
    public static void main(String[] args){
        Person person = new Person();
        person.setName("민국").setAge(21).sayHello();        // 메서드 체이닝
    }
}