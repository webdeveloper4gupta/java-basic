package Try;
import java.util.Scanner;
class My extends Exception{
//    exception class method
    public String toString(){
        return super.toString()+"I am toString()";
    }
    public String getMessage(){
        return super.getMessage()+"I am getMessage()";
    }
}
public class exceptionclass {
    public static void main(String[] args) {
        int a=8;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(a<9){
            try{
                throw new My();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();//used to know which line error comes
            }
        }

    }
}
