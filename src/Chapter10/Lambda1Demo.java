package Chapter10;

import java.util.Arrays;

public class Lambda1Demo{
    public static void main(String[] args){
        String[] strings = {"String 1", "String 2", "String3"};
        
        Arrays.sort(strings, (first, second) -> first.length() - second.length());        // lambda
        
        for(String s : strings)
            System.out.println(s);
    }
}