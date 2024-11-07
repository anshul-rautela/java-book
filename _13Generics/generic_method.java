package _13Generics;

public class generic_method {
    static <T extends Comparable<T>,V extends T> boolean init(T x, V[]arr){
        for(int i =0;i<arr.length;i++){
            if(x.equals(arr[i])){
                return true;
            }    
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[]arr= {1,2,3,4,5,78};
        if(init(1, arr)){
            System.out.println("1 is in nums"); 
         }
         if(init(2, arr)){
            System.out.println("2 is in nums"); 
         }if(init(8, arr)){
            System.out.println("8 is in nums"); 
         }
         if(init(7, arr)){
            System.out.println("7 is in nums"); 
         }
         //init("eh",arr);
        
    }
}
