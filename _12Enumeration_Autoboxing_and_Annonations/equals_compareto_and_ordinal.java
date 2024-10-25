package _12Enumeration_Autoboxing_and_Annonations;

public class equals_compareto_and_ordinal {
    enum fruit{
        apple,grapes,mango,papaya,banana;
    }
    public static void main(String[] args) {
    fruit ap = fruit.apple;
    fruit ma = fruit.mango;
    fruit ba = fruit.banana;

    if(ap.compareTo(ma)>0){
        System.out.println("apple is greater than mango");
    }
    if(ap.compareTo(ma)<0){
        System.out.println("apple is lesser than mango");
    }

    if(ap.equals(ap)){
        System.out.println("aple = aple");
    }
    if(ap == (ap)){
        System.out.println("aple = aple");
    }
    System.out.println("Ordinal value of apple is "+ap.ordinal());    
    
        }    }

