package _12Enumeration_Autoboxing_and_Annonations;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface intro{
    int val() default 21;
    String s() ;

}

@Retention(RetentionPolicy.RUNTIME)
@interface place{
    String p();
}

@place(p="dehredun")
@intro(s="anshul")
public class allanotaion {
    @intro(s="name")
    @place(p="Uttraknd")
    public static void main(String[] args) {
        allanotaion a = new allanotaion();
        Class <?>c = a.getClass();
        Annotation arr[]=c.getAnnotations();
        for(Annotation x:arr)
            System.out.println(x);
        try{
            Method m = c.getMethod("main",String[].class);
            Annotation arr2[]=m.getAnnotations();
            for(Annotation x1:arr2)
                System.out.println(x1);
        }catch(NoSuchMethodException e){
            System.out.println("error");
        }

    }
}
