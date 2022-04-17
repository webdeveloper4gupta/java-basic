public class meth {
//    method 1 to declare the methods in java
//    static int logic(int a,int b){
//        return a+b;
//    }
//
//2nd method to create the method
    int logic(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
       meth aman=new meth();
      int c= aman.logic(1,2);
        System.out.println(c);
    }
}
