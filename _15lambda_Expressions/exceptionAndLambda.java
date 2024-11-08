package _15lambda_Expressions;  

class EmptyArrayException extends Exception{
    public EmptyArrayException(){
    super("Array Empty"); 
    }   
}
interface DoubleArr{
    int dou(double[] d) throws EmptyArrayException;
}

public class exceptionAndLambda {
    public static void main(String[] args) throws EmptyArrayException{
        double d[]={1.0,2.9,3.0,4.9};
        DoubleArr f = (n)->{ 
            if(n.length!=0)    
                return n.length;
            else{
                throw new EmptyArrayException();
            }
        };
        System.out.println(f.dou(d));
        System.out.println(f.dou(new double[0]));        
    }    
}
