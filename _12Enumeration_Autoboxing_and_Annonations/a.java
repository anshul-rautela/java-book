package _12Enumeration_Autoboxing_and_Annonations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Add annotation to a method
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface myanno {
    int age();
    String name() default "Anshul";
}

public class a {
    @myanno(age = 23)
    public static void mymeth() {
        try {
            // Use the correct class reference
            Class<?> c = a.class;
            Method m = c.getMethod("mymeth", (Class<?>[]) null); // Correctly fetch the method
            myanno ab = m.getAnnotation(myanno.class);
            System.out.println("Age from annotation: " + ab.age());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }

    public static void main(String[] args) {
        mymeth();
    }
}
