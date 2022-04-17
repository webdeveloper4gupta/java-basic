package Try;
import java.util.Scanner;
public class Handlingspecificexception {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        int number=sc.nextInt();
        try{
            System.out.println(marks[index]/number);
        }
        catch(ArithmeticException E){
            System.out.println(E);
        }
        catch(ArrayIndexOutOfBoundsException E){
            System.out.println(E);
        }
        catch(Exception e){
            System.out.println("some exception come");
        }
    }
}
