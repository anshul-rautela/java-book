package _12Enumeration_Autoboxing_and_Annonations;
import java.util.Random;
enum prob{
    no,yes,maybe,later,soon,never;
}
class Q{
    prob ask(){
    Random rand = new Random();
    int r=(int)(rand.nextDouble()*100);
    if(r<15) return prob.maybe;
    if(r<30) return prob.no;
    if(r<60) return prob.yes;
    if(r<75) return prob.later;
    if(r<90) return prob.soon;
    else return prob.never;    
    }
}
class ans{
    void f(prob a){
    Q q=new Q();
    switch (q.ask()) {
        case maybe:
        System.out.println("MAYBE");
        break;
        case no:
        System.out.println("NO");
        break;
        case yes:
        System.out.println("YES");
        break;
        case soon:
            System.out.println("SOON");
            break;
            case later:
            System.out.println("LATER");
            break;
            case never:
            System.out.println("NEVER");
            break;
        } 
    }
}
public class enum_example {
public static void main(String[] args) {
    ans a=new ans();
    Q p = new Q();
    prob pr=p.ask();
    a.f(pr);
    pr=p.ask();
    a.f(pr);
    pr=p.ask();
    a.f(pr);
    pr=p.ask();
    a.f(pr);


}
    
}
