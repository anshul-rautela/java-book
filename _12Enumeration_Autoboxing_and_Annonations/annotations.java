package _12Enumeration_Autoboxing_and_Annonations;
import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ano{
    int n() default 23;
    String s();
}

public class annotations {
    @ano(s ="Hello")
    public static void mymeth(String s,int n){
        annotations a = new annotations();
        Class<?>c = a.getClass();
        try{
        Method m = c.getMethod("mymeth", String.class,int.class);
        ano an = m.getAnnotation(ano.class);
        System.out.println(an.n()+" "+an.s());
    }catch(NoSuchMethodException e ){
            System.out.println("thid eror");
        }
    }
    public static void main(String[] args) {
        mymeth("hi",21);
    }
}