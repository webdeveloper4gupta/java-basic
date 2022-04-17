
class amu{
    int a;
    int b;
    amu(int a,int b) {
        this.a = a;
        this.b = b;
    }
//    here i writergetter method
    void am(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
}


public class thisandsuper {
    public static void main(String[] args) {
        amu a=new amu(1,2);
        a.am();

    }
}
