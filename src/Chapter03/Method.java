package Chapter03;

public class Method{
    
    public static void main(String[] args){
        
        System.out.println("sum for 1 to 100 : " + sum(1, 10));
        System.out.println("sum for 10 to 100 : " + sum(10, 100));
        System.out.println("sum for 100 to 1000 : " + sum(100,1000));
    }
    
    
    // 이것이 메서드이다.
    
    // public : 접근 지정자
    // static : 객체 없이 생성 가능
    public static int sum(int i1, int i2){
        
        int sum = 0;
        
        for(int i = i1; i <= i2; i++){
            sum += i;
        }
        
        return sum;
    }
}