package _10Exception_Handling;
public class throws_keyword {
    /*static void f(){
        System.out.println("this");
        throw new IllegalAccessException();
    }*/

    static void f() throws IllegalAccessException{
        System.out.println("before throwing...");
        throw new IllegalAccessException("this exeption");
      //  System.out.println("after throwing...");
    }
    public static void main(String[] args) throws IllegalAccessException{
        f();
        System.out.println("after exeption");
        
    }
}

//Output
/* 
before throwing...
Exception in thread "main" java.lang.IllegalAccessException: this exeption
        at _10Exception_Handling.throws_keyword.f(throws_keyword.java:10)
        at _10Exception_Handling.throws_keyword.main(throws_keyword.java:14)
 */
