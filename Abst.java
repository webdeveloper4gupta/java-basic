abstract class  rahul{
    int a;int b;
    rahul(){
        System.out.println("rahul class constructor");
    }
    void come() {
        System.out.println("this is abstract class method");
    }
    abstract void go();
}
class rajats extends rahul{
    void go(){
        System.out.println("yhurray");
    }
}
public class Abst {
    public static void main(String[] args) {
        rahul r=new rajats();
        r.go();
        r.come();

    }
}
