package thread;
//here i will tell you thread constructor
class Suk1 extends Thread{
    public Suk1 (String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<10){
            System.out.println("i am a thread");
            i++;
        }
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        Suk1 t=new Suk1("sukritan");
        t.start();
        System.out.println(t.getId());
        System.out.println(t.getName());
    }
}
