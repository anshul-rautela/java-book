package _13Generics;

class parent <T>{
    T i;    
    parent(T i)
    {
        this.i=i;
        System.out.println("Parent constructor called");
    }
}
class child<T> extends parent<T>{
    T in;
    child(T i){
        super(i);
        System.out.println("Child constructor called");
    }
} 

public class generic_superclass {
    public static void main(String[] args) {
        child<Integer> c = new child<>(1) ;     
    }    
}
