package _11Multithreaded_Programming;

public class MainThread {
    public static void main(String[] args) { 
    Thread t = Thread.currentThread();
    System.out.println("Current thread: "+t);  //name, priority, name of group of threads
    System.out.println("Current thread: "+t.getName());
    t.setName("My thread");
    System.out.println("after name change"+t);

    for(int i = 5;i>=0;i--){
        try {            
            System.out.println(i);
            Thread.sleep(1000);   
        } catch (InterruptedException e) {
            System.out.println("Exeption caught");
        }
    }
}

}
