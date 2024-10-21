package _10Exception_Handling;

public class ChainedExceptions {
    static void f(){
        NullPointerException e = new NullPointerException("This is the exeption");
        e.initCause(new ArithmeticException("Cause: this is its Cause"));
        throw e;
    }
     public static void main(String[] args) {
        try{
        f();}
        catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e){  //multi-catch
            System.out.print("Exeption caught: ");
            System.out.println(e);
            System.out.println("Original cause: "+e.getCause());
        }
     }
}
