package _11Multithreaded_Programming;

class NewThread implements Runnable{
    Thread t;
    NewThread(String s){
        t = new Thread(this,s);
        System.out.println("New thread: "+t);
    }
    @Override
    public void run() {
        
    try{
        System.out.println("Starting "+t.getName());
        for(int i = 5;i>=0;i--){
            System.out.println(t.getName()+": "+i);
            Thread.sleep(1000);
        }
    }catch(InterruptedException e){
        System.out.println("exeption");
    }
    }
}
public class isAlive_and_Join {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Thread one");
        NewThread nt2 = new NewThread("Thread two");
        NewThread nt3 = new NewThread("Thread Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Thread 1 is alive: "+nt1.t.isAlive());
        System.out.println("Thread 2 is alive: "+nt2.t.isAlive());
        System.out.println("Thread 3 is alive: "+nt3.t.isAlive());
       try{
        nt1.t.join();
        nt2.t.join();
        nt3.t.join();
       }catch(InterruptedException e){
        System.out.println("Exeption");
       }
       System.out.println("Thread 1 is alive: "+nt1.t.isAlive());
       System.out.println("Thread 2 is alive: "+nt2.t.isAlive());
       System.out.println("Thread 3 is alive: "+nt3.t.isAlive());
       System.out.println("Exiting main thread");
    }
}