package thread;
//here i will tell you how yo make thread using second method
class Myname1 implements Runnable{
    public void run(){
        while(true){
            System.out.println("this is sukritan gupta");
        }

    }
}

class Myname2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("this is aman gupta");
        }

    }
}

public class threadusingrunninginterface {
    public static void main(String[] args) {
        Myname1 m=new Myname1();
        Myname2 n=new Myname2();
        Thread a1=new Thread(m);
        Thread a2=new Thread(n);
        a1.start();
        a2.start();
    }
}
