package Chapter05;

public class RestArg{
    
    public static void main(String[] args){
        
        printSum(1,2,3,4,5);
        printSum(10, 20, 30);
        
    }
    
    public static void printSum(int... rest){
        
        int sum= 0;
        for(int i : rest)
            sum += i;
        
        System.out.println(sum);
    }
}