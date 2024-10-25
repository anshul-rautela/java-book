    package _12Enumeration_Autoboxing_and_Annonations;
    import java.lang.annotation.*;
    import java.lang.reflect.Method;

    //add anotaion to a method
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface myanno{
        int age();
        String name() default "Anshul";
    }

    public class anonation2{
        @myanno(age=23)
        static void mymeth(){
            try{
            anonation2 a= new anonation2();
            Class <?>c= a.getClass();
            Method m = c.getMethod("mymeth");
            myanno ab=  m.getAnnotation(myanno.class);
            System.out.println(ab.age());
        }catch(NoSuchMethodException e){
           System.out.println("this eror: "+e);
        }   
        }
        public static void main(String[] args) {
            mymeth();
        }
    }