package _12Enumeration_Autoboxing_and_Annonations;
enum fruits{
    apple(10), banana(23), guava, pineapple(34),pear;
    private int price;
    fruits(){                    //default constructor
        price =-1;
    }
    fruits(int price){          //constructor
        this.price=price;
    }
    public int getPrice() {     
        return price;
    }
}
public class enum_as_class_type {
public static void main(String[] args) {
   
    System.out.println(fruits.apple.getPrice());
    System.out.println(fruits.banana.getPrice());
    System.out.println(fruits.guava.getPrice());


}
    
}