
class suku{
    int a;
    int b;
    int c;
    public void gupta(){
        System.out.println("suku class method");
    }
    public void am(){
        System.out.println("jindabaad");
    }

}
class sukrita extends suku{
    int a;int b;
    @Override
    public void gupta(){
      super.gupta();
        System.out.println("sukrita class method");
    }
}
public class methodover {
    public static void main(String[] args) {
        sukrita suk=new sukrita();
        suk.gupta();
        suk.c=90;
        System.out.println(suk.c);
    }
}
