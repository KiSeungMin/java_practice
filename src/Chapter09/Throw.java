package Chapter09;

import java.util.Scanner;

public class Throw{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        try{
            square(in.nextLine());
        }
        
        // square 메서드에서 오류가 발생할 경우 스스로 처리하지 않고 여기서 처리한다.
        catch(NumberFormatException e){
            System.out.println("Not Integer");
        }
    }
    
    // s가 문자열이 아니면 NumberFormatException 예외가 발생한다.
    private static void square(String s) throws NumberFormatException{
        int n = Integer.parseInt(s);
        System.out.println(n * n);
    }
}