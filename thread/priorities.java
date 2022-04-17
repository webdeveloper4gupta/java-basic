package thread;
//here i will tell you thread priorities
class Mythread3 extends Thread{
    public Mythread3( String name){
        super(name);

    }
    @Override
    public void run(){
        while(true){
            System.out.println("my thread is running");
            System.out.println("i am happy"+this.getName());
        }
    }
}


public class priorities {
    public static void main(String[] args) {
        Mythread3 m=new Mythread3("sukritan");
        Mythread3 n=new Mythread3("aman");
//        here i set the priority
        m.setPriority(Thread.MAX_PRIORITY);
        m.start();
        n.start();

    }
}
