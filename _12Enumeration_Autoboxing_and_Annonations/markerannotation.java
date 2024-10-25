package _12Enumeration_Autoboxing_and_Annonations;

import java.lang.annotation.RetentionPolicy;
import java.text.Annotation;
import java.lang.annotation.Retention;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface anno{}

@anno
public class markerannotation {
    @anno
    public static void main(String[] args) {
           markerannotation ob=new markerannotation();
           anno an = ob.getClass().getAnnotation(anno.class);
           if(ob.getClass().isAnnotationPresent(anno.class)){
            System.out.println("anotaion present");
           }
        }
    
}
