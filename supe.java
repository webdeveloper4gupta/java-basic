
class fg{
    int a;int b;
    fg(){
        System.out.println("fg class zero constructor");
    }
    fg(int a,int b){
        System.out.println("fg class param constructor");
    }
}
class fh extends fg{
    fh(int y){
        super(1,0);
        System.out.println("fh param constructor");
    }
}


public class supe {
    public static void main(String[] args) {
        fh g=new fh(1);

    }
}
