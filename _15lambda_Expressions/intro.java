package _15lambda_Expressions;

interface funtionalInterface {
    double getvalue();    
}

interface twoparameter{
    boolean check(int a,int b);
}

interface Numericfunc {
    int fact(int n);    
}

public class intro {
    public static void main(String[] args) {
        funtionalInterface f;
        f= ()->123.2;
        System.out.println(f.getvalue());

        twoparameter t = (a,j)->a%j==0; //if u add (int a,b) it will get error but you can use (int a,int b)   
        if(t.check(10, 5)){
            System.out.println("a divides b");
        }
        
        Numericfunc nf = (int n)->{
            int fact =1;
            for(int i =1;i<=n;i++){
                fact*=i;
            }
            return fact;
        };
        System.out.println(nf.fact(3));
    }    
}
