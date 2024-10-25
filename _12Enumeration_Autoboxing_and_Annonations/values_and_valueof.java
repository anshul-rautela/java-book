package _12Enumeration_Autoboxing_and_Annonations;

public class values_and_valueof {
    enum fruit{
        apple,pineapple,guava,papaya,grapes
    }
    public static void main(String[] args) {
        
    fruit f;
    f = fruit.apple;
    System.out.println(fruit.valueOf("guava"));
    fruit arr[]=fruit.values();
    for(fruit x:arr)
    System.out.println(x);
    System.out.println(f);
}
}
