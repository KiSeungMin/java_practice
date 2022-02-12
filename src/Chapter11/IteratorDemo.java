package Chapter11;

import java.util.*;

public class IteratorDemo{
    
    public static void main(String[] args){
        Collection<String> list = Arrays.asList("다람쥐","개구리", "나비");
        
        Iterator<String> iterator = list.iterator();
        
        while(iterator.hasNext())
            System.out.print(iterator.next() + "-");        // List의 모든 원소 출력
        System.out.println();
            
        while(iterator.hasNext())
            System.out.print(iterator.next() + "+");        // 이미 사용한 반복자이므로 원소를 다시 순회할 수 없다
        System.out.println();
        
        iterator = list.iterator();
        
        while(iterator.hasNext())
            System.out.print(iterator.next() + "=");        // iterator 객체를 다시 가져와서 순회
        
    }
}