package _10Exception_Handling;

public class nestedtry {
   public static void main(String []args){
    int  n =args.length;
    try{
        int a = 12/n;
        System.out.println("a= "+a);
        try {
            int []c={};
            c[34]=2;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exeption: "+e);
        }
        catch(Exception e){
            System.out.println("IF exeption occurs other than OutOfBound"+e);
        }
    }
    catch(ArithmeticException e){
        System.out.println("Exception: "+e);
    }
   } 
}
