
interface  tafi{
    void get();
    void come();
}
interface tafia extends tafi{
    void get1();
    void get2();
}
class dlf implements tafia{
    public void get1(){
        System.out.println("hello");
    }
    public void  get2(){
        System.out.println("jammu");
    }
    public void get(){
        System.out.println("wala");
    }
    public void come(){
        System.out.println("heoo");
    }
}

public class interhitanceinterface {
    public static void main(String[] args) {
         dlf d=new dlf();
         d.get();
    }
}
