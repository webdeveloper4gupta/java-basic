class gupas{
    void get(){
        System.out.println("gupas class get method");
    }
    void aman(){
        System.out.println("gupas class amnan method");
    }
}
class sukritans extends gupas{
    void get(){
        System.out.println("sukritans class get method");
    }
    void sukri(){
        System.out.println("sukritans class sukri method");
    }

}
public class dynamic_method {
    public static void main(String[] args) {
        gupas g=new sukritans();
        g.get();
//        g.sukri();
        g.aman();
    }
}
