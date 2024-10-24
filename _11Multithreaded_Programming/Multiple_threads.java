package _11Multithreaded_Programming;

class NewThread implements Runnable{
    Thread t;
    NewThread(String s){
        t = new Thread(this,s);
        System.out.println("Thread Created: "+t);
    }
    public void run(){
        try{
            System.out.println(t.getName()+" started exexuting...");
            for(int  i = 5;i>=0;i--){
                System.out.println(t.getName()+" "+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("exeption");
        }
        System.out.println(t.getName()+" Exit its execution");
    }
}

public class Multiple_threads {
    public static void main(String[] args) {
        NewThread t1 = new NewThread("Thread One");   
        NewThread t2 = new NewThread("Thread Two");   
        NewThread t3 = new NewThread("Thread Three");   
        t1.t.start();
        t2.t.start();
        t3.t.start();
        try{
            Thread.sleep(10000);
        }catch(Exception e){
            System.out.println("Exeption");
        }
        System.out.println("Main thread ended.");
    }
}
