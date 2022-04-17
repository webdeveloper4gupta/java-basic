package sukri;

import java.util.jar.JarOutputStream;

class amange{
    int a;
    public int b;
    private int c;
    protected int d;
   void prin(){
       System.out.println("hello");
   }
}

public class access_modi {
    public static void main(String[] args) {
        amange aman=new amange();
        aman.a=1;
        aman.b=2;
//        aman.c=3;
        aman.d=4;
        System.out.println(aman.a);
        System.out.println(aman.b);
//        System.out.println(aman.c);
        System.out.println(aman.d);

    }
}
