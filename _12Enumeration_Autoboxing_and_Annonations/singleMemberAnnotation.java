package _12Enumeration_Autoboxing_and_Annonations;
import java.lang.annotation.Retention;
import java.lang.reflect.Method;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface anno{
    int value();  //try to change name of value();
    int val() default 23;
}

public class singleMemberAnnotation {
    @anno(value = 100)
    public static void main(String[] args) {
        singleMemberAnnotation s = new singleMemberAnnotation();
        try{
        Method m = s.getClass().getMethod("main", String[].class);
        anno a =m.getAnnotation(anno.class);
        System.out.println(a.value());
        System.out.println(a.val());
        }catch(NoSuchMethodException e){System.out.println("error");}
    }
    
}
