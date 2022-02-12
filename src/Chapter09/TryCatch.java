package Chapter09;

public class TryCatch{
    
    public static void main(String[] args){
        
        int dividend = 10;
        
        try{
            
            int divisor = Integer.parseInt(args[0]);
            System.out.println(dividend/divisor);
        }
        
        // 배열 범위를 벗어난 인덱스를 사용할 때 발생
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No Element.");
        }
        
        // main()메서드의 인수를 숫자로 바꿀 수 없을 때 발생
        catch(NumberFormatException e){
            System.out.println("Not number.");
        }
        
        // main()메서드의 인수가 0일 때 발생
        catch(ArithmeticException e){
            System.out.println("can't divided by 0");
        }
        
        // 예외 발생과 관계없이 항상 실행
        finally{
            System.out.println("always excute");
        }
        System.out.println("end.");
    }
}