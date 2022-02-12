package Chapter10;

interface Mathematical {double calculate(double d);}
interface Pickable {char pick(String s, int i);}
interface Computable { int compute(int x, int y);}

class Utils{
    int add(int a, int b) { return a + b; }
}

public class MethodRefDemo{
    
    public static void main(String[] args){
        
        Mathematical m;
        Pickable p;
        Computable c;
        
        m = Math::abs;        // m = d -> Math.abs(d);
        System.out.println(m.calculate(-50.3));
        
        
        p = String::charAt;        // p = (a, b) -> a.charAt(b);
        System.out.println(p.pick("Hello world!", 4));
        
        Utils utils = new Utils();
        
        c = utils::add;
        System.out.println(c.compute(20,30));
    }
}