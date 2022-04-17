package collectionframework;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
//        ArrayList a;
//        here i will tell you array list
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(12);
        l2.add(13);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(0,89);
        l1.addAll(0,l2);//add from starting
//        contain
        System.out.println(l1.contains(12));

//        indexOf
        System.out.println(l1.indexOf(12));

//        set
        l1.set(0,12);
//        print the list

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));

        }
//        to clear
//        l1.clear();
    }
}
