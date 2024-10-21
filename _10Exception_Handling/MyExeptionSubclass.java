package _10Exception_Handling;

public class MyExeptionSubclass extends Exception {
    private String s;
    public MyExeptionSubclass(String s){
        this.s = s;
    }
    public String toString(){
        return ("My Exeption Thrown: "+s);
    }
}
class main{
  static void f(int i) throws MyExeptionSubclass{
            if(i<10)
        System.out.println("normal execution");
        if(i>10){
        System.out.println("i  >10 throwing exeption....");
        throw new MyExeptionSubclass("["+i+"] is greater than 10");
    }
}
    public static void main(String[] args) {
        try{
        f(1);
        f(20);}
        catch(Exception e){
            System.out.println("Exeption caught: "+e);
        }
    }
}
