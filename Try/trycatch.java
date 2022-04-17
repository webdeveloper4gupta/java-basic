package Try;
public class trycatch {
    public static void main(String[] args) {
        int a=6;
        int b=9;
        try{
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){//e is object of exception
            System.out.println(e);
        }
        System.out.println("hello");//this is run everytijme
    }
}
