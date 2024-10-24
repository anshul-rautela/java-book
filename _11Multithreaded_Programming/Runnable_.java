package _11Multithreaded_Programming;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this,"Demo Thread");   
        System.out.println("Child thread: "+t);
    }
    public void run(){
        System.out.println("Inside demo thread: "+t);
        try {
            for(int i = 5;i>=0;i--){
                System.out.println("child thread "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("exeption");
        }
        System.out.println("Exiting child thread.");
    }
}
public class Runnable_ {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();  
        System.out.println("Starting main thread: ");
        try{
            for(int i =5;i>=0;i--){
                System.out.println("main thread "+ i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("exeption caught");
        }   
    }
}
