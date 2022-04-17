import java.util.ArrayList;
class Mygenric <T1>{
    int val;

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    private T1 t1;
    public Mygenric(int val,T1 t1){
        this.val=val;
        this.t1=t1;
    }
}
public class javagenrics {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(23);
         Mygenric g1=new Mygenric(23,45);
         g1.getT1();
    }
}
