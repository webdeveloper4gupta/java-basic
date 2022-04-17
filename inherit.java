
class basse{
    int a;
    int b;
    void suk(){
        System.out.println("basse class  function");
    }
}
class jumbo extends basse{
    int c;
    int d;
//    here i make getter
    void getter(int a,int b){
        this.c=a;
        this.d=b;
    }

}

public class inherit {
    public static void main(String[] args) {
        jumbo j=new jumbo();
        j.suk();
    }
}
