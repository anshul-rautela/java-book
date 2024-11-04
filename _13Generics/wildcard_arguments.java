package _13Generics;

class stats<T extends Number>{
    T arr[];
    stats(T arr[]){
        this.arr=arr;
    }
    double calavg(){
        double sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i].doubleValue();
        }
        return(sum/arr.length);
    }
    boolean getavg(stats<?> ob){// without ? it will not work
        if(calavg()==ob.calavg()){
            return true;
        }
        return false;
    }
}

public class wildcard_arguments {
   public static void main(String[] args) {
    
    Integer[]arr={1,2,3,4,6};
    Double[]drr={1.0,2.0,3.0,4.0,6.0};
    stats<Integer> i= new stats<Integer>(arr);
    stats<Double> d= new stats<>(drr);
    
    if(i.getavg(d)){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
}

}
