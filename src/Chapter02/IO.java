package Chapter02;

import java.util.Scanner;

public class IO{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String str = in.next();        // input string
        
        int bt = in.nextByte();        // input byte
        
        short srt= in.nextShort();        // input short
        
        int it = in.nextInt();        // input int
        
        long lg= in.nextLong();        // input long
                
        float fl = in.nextFloat();        // input float
        
        double db = in.nextDouble();        // input double
        
        String str2 = in.nextLine();        // input string
        
        System.out.println(str + "\n" + bt + "\n" + srt + "\n" + it + "\n" + lg + "\n" + fl + "\n" + db + "\n" + str2);

    }
}