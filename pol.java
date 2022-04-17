interface camera{
    void click();
}
interface wifi {
    void connect();
}

class mobile {
  void call(){
        System.out.println("mobile clascall meethod");
    }

}
class sukris extends mobile implements camera,wifi{
    public void click(){
        System.out.println("hello");
    }
    public void connect(){
        System.out.println("connect");
    }
}

public class pol {
    public static void main(String[] args) {
   sukris s=new sukris();
   s.click();
   s.connect();
   s.call();
    }
}
