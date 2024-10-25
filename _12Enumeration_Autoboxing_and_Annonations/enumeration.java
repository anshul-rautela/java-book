package _12Enumeration_Autoboxing_and_Annonations;

public class enumeration {

enum Fruits{
    apple,banana,guava,pear,grapes,mango
}
    public static void main(String[] args) {

        Fruits f;
        f = Fruits.banana;
        System.out.println(f);
    if(f==Fruits.apple){
        System.out.println("f=apple");
    }
    if(f==Fruits.banana){
        System.out.println("f=banana");
    }
    switch(f){
        case apple:
            System.out.println("apple");
            break;
        case banana:
            System.out.println("Banana");
            break;
        default:
            System.out.println("no fruit");
        }
    }

}
