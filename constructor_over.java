import org.w3c.dom.ls.LSOutput;

class sukrit{
    sukrit(){
        System.out.println("zero arumnet consructor");
    }
    sukrit(int a,int b){
        System.out.println("two argument constructor");
    }


}

public class constructor_over {
    public static void main(String[] args) {
        sukrit aman=new sukrit();
        sukrit am=new sukrit(1,2);
    }
}
