package Chapter05;

import java.util.Scanner;

public class ArrayDemo{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int scores[] = new int[5];         // 크기가 5인 배열 생성
        
        int sum = 0;
        
        for(int i = 0; i < scores.length; i++){
            scores[i] = in.nextInt();
        }
        
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        
        System.out.println("평균 = " + sum / 5.0);
    }
}