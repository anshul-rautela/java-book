package _11Multithreaded_Programming;

class Q{
    boolean value=false;
    int n=1;
    synchronized void put(int n){
        if(value){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        System.out.println("Put: "+n);
        this.n=n;
        notify();
        value =true;
    }
    synchronized void get(){
        if(!value){
            try{
                wait();
            }catch(InterruptedException e){}
        }
        System.out.println("Get: "+n);
        notify();
        value=false;
    }
}
class producer implements Runnable{ 
    Q q;
    Thread t;   
    producer(String s,Q q){
        this.q=q;
        t = new Thread(this,"producer");
    }
    public void run(){
        int i =1;       
        while(true){
            q.put(i++);
            try{
            Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("exept");
            }
        }
    }
}
class consumer implements Runnable{
    Thread t;
    Q q;
    consumer(String s,Q q){
        t = new Thread(this,"consumer");
        this.q=q;
    }
    public void run(){
        int i =1;      
        try{ 
        while(true){
            q.get();
            Thread.sleep(1000);
        }}catch(Exception e){}
    }
}

public class Interthread_Communication {
    public static void main(String[] args) {
        Q q=new Q();
        producer p= new producer("p", q);
        consumer c= new consumer("c",q);
        p.t.start();
        c.t.start();
    }
}
