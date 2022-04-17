
class ama{
    ama(){
        System.out.println("ama zero class constructor");
    }
    ama(int a,int b){
        System.out.println("ama non zero constructor");
    }
}
class suke extends ama{
    suke(){
        System.out.println("suke zero class constructor");
    }
    suke(int a,int b){
        System.out.println("suke non zero constructor");
    }

}
public class constructor_inheritance {
    public static void main(String[] args) {
      suke a=new suke(1,2);
    }
}
