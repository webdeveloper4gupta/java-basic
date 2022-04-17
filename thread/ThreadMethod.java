package thread;
//here i will tell you aout thread method
class Mythread4 extends Thread{

    @Override
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("my thread is running");
            System.out.println("i am happy");
            i++;
        }
    }
}
public class ThreadMethod {
    public static void main(String[] args) {
        Mythread4 m=new Mythread4();
        Mythread3 n=new Mythread3("sukritan");
        m.start();

//        join method
        try {
            m.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        n.start();
    }
}
