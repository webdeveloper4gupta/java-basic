import org.w3c.dom.ls.LSOutput;

public class method_over {
   void sum(int a,int b){
        System.out.println("two parrameter sum method");
    }
    void sum(int a,int b,int c){
        System.out.println("three parameter sum method");
    }

    public static void main(String[] args) {
        method_over a=new method_over();
  a.sum(1,2,3);
  a.sum(1,2);

    }
}
