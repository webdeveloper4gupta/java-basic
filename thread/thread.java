package thread;
//here i will tell you how we create thread by using extending thread class
class Mythread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("i am safe and live with my family");
            System.out.println("i am wants to become software engineer");
        }

    }
}
public class thread {
    public static void main(String[] args) {
    Mythread1 m=new Mythread1();
    Mythread2 n=new Mythread2();
    m.start();
    n.start();
    }
}
