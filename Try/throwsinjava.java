package Try;

public class throwsinjava {
    public static int result(int a,int b)throws ArithmeticException{//to handle error we used thows here
        return (a/b);
    }
    public static void main(String[] args) {
        try {
            int c = result(1, 0);
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    }
