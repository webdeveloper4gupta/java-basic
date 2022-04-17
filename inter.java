interface amane{

  public  void get();
    void come();
   public void suk();
}
class kl implements amane{
    public void get(){
        System.out.println("hello");
    }
 public void come(){
        System.out.println("sukrityan");
    }
   public void suk(){
        System.out.println("amaners");
    }
}

public class inter {
    public static void main(String[] args) {
        kl l=new kl();
        l.get();
    }
}
