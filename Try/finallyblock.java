package Try;

public class finallyblock {
    public static void main(String[] args) {
        try{
            int a=2;
            int c=a/0;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("exception ");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
