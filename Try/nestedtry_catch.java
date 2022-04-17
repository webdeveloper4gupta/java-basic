package Try;

public class nestedtry_catch {
    public static void main(String[] args) {
        try{
            System.out.println("welcome");
            try{
                int a=2;
                int b=0;
                int c=a/b;
                System.out.println(c);

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("exception in level 1");
        }
    }
}
