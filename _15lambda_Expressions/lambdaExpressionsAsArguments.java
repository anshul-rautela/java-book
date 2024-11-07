package _15lambda_Expressions;

interface Func{
    String  f(String s);
}
public class lambdaExpressionsAsArguments {
    static String StringOP(Func f,String s){
        return f.f(s);
    }
    public static void main(String[] args) {
        
        String s = "Welcome To Graphic Era Hill University";

        String s2 = StringOP((sr)->s.toLowerCase(), s);

        String s3 = StringOP((st)->s.toUpperCase(), s);

        String s4 = StringOP((st)->{
            return st.indent(3);
        }, s);
        System.out.println(s+" "+s2+" "+s3+" "+s4+" ");
    }
}

