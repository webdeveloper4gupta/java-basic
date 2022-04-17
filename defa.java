interface amanesd{
    void sum();
    void sub();
    private void area(){
        System.out.println("this is private method inseide the amanes class");
    }
    default void sukri(){
        System.out.println("hello this is default method");
    }
}
class amj implements amanesd{
    public void sum(){
        System.out.println("this is suk");
    }
    public void sub(){
        System.out.println("this is ama");
    }

}
public class defa {
    public static void main(String[] args) {
        amj j=new amj();
        j.sub();
    }
}
