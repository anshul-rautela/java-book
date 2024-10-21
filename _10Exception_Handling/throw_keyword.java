package _10Exception_Handling;

public class throw_keyword {
    public static void main(String []args){
    //supose i dont want my prog, to divide by 1 and if it does throw an arithmatic exeption
    try {
        int divideby=1;
        if(divideby==1){
            throw new ArithmeticException("Cant divide by 1");
        }
        int a = 12/divideby;
       System.out.println(a);
    } catch (ArithmeticException e) {
        System.out.println("Exeption:- "+e);
    }
    
    }
}
