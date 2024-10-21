package _10Exception_Handling;
public class intro {
    public static void main(String []args){
        try{
            int a = 3/0;
        }
        catch(ArithmeticException e){
            System.out.println("This cant divide by zero");
            System.out.println("Exception: "+e);
        }
        System.out.println("after catch");
    }
}
