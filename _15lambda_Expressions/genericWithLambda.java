package _15lambda_Expressions;

interface gen<T>{
   T demo(T n);
}

public class genericWithLambda {

    public static void main(String[] args) {
        
        gen<String>st =(String s)->{
            String reversed = new StringBuilder(s).reverse().toString();
            return reversed;
        };

        gen<Integer>in=(n)->{
            int fact=1;
            for(int i =1;i<=n;i++){
                fact*=i;
            }
            return fact;
        };
        System.out.println("facorial of 4 is "+in.demo(4));
        System.out.println("The reverse of 'Graphic Era' is "+st.demo("Graphic Era"));
    }
}