package _11Multithreaded_Programming;

class Callme{
    void call(String s){
        System.out.print("[hello ");
        try{
        Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Exeption ");
        }
        System.out.println(s+"]");
    }
}
class Caller implements Runnable{
    Callme c;
    Thread t;
    String msg;
    Caller(String s,String msg,Callme c){
        this.c = c;
        t= new Thread(this,s);
        System.out.println("Thread created");
        this.msg=msg;
    }
    public void run(){
        synchronized(c){
        c.call(msg);
        }
    }
}

public class Syncronised {
    public static void main(String[] args) {

        Callme c=new Callme();
        Caller c1 = new Caller("Thread one","Anshul",c);
        Caller c2 = new Caller("Thread two","Priya",c);
        Caller c3 = new Caller("Thread three","Ayush",c);
        c1.t.start();
        c2.t.start();
        c3.t.start();

    try{
        c1.t.join();
        c2.t.join();
        c3.t.join();
    }catch(Exception e){
        System.out.println("exeption");
    }   
    }   
}
