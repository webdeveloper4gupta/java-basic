
interface horm{
    void meth1();
//    void meth2();
}
//class anonydemo implements  horm{
//    @Override
//    public void meth1(){
//        System.out.println("sukri");
//    }
//    @Override
//    public void meth2(){
//        System.out.println("gupta");
//    }
//    public void display(){
//        System.out.println("hello");
//    }
//}
public class lambda {

    public static void main(String[] args) {
//        anonymous class
//     horm obj=new horm(){
//         @Override
//         public void meth1(){
//             System.out.println("gupta");
//         }
//         @Override
//         public void meth2(){
//             System.out.println("sukri");
//         }
//     };
//     obj.meth1();

//        lambda
        horm obj=()->{
            System.out.println("hello");
        };
        obj.meth1();
    }
}


