import java.util.*;
class sukut{
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
class sukritas extends suku{
    int a;int b;
    @Override
    public void gupta(){
        super.gupta();
        System.out.println("sukrita class method");
    }
}
public class javasnnotions {
    public static void main(String[] args) {

    }
}
