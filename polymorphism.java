interface cameras{
    void click();
}
interface wifis{
    void connection();
}
interface gps{
    void direction();
}
class phone{
    void call(){
        System.out.println("phone call");
    }
}
class smartphone extends phone implements cameras,wifis,gps{
    public void click(){
        System.out.println("this is click inside smartphone");
    }
    public void connection(){
        System.out.println("this is click inside wifis");
    }
    public void direction(){
        System.out.println("this is direction inside the smartphone");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        cameras c=new smartphone();
        c.click();
//        c.direction(); it gives error
    }
}
