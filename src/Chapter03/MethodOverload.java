package Chapter03;

public class MethodOverload{
    
    public static void main(String[] args){
        
        int i1= 3, i2= 7, i3 = 10;
        double d1 = 7.0, d2 = 3.0;
        
        System.out.println(max(i1, i2));
        System.out.println(max(d1, d2));
        System.out.println(max(i1, i2, i3));
    }
    
    // 메서드 이름, 매개변수의 개수, 매개변수의 데이터 타입, 매개변수의 순서가 다른 것을 이용해  메서드 오버로딩이 가능하다.
    
    public static int max(int n1, int n2){
        int result = n1 > n2 ? n1 : n2;
        return result;
    }
    
    public static double max(double n1, double n2){
        double result = n1 > n2 ? n1 : n2;
        return result;
    }
    
    public static int max(int n1, int n2, int n3){
        return max(max(n1, n2), n3);
    }
}