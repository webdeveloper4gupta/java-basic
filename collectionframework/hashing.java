package collectionframework;

import java.util.HashSet;

public class hashing {
    public static void main(String[] args) {
//        HashSet<Integer>  l1=new HashSet<>();//capacity 16 and loading 0.75
        HashSet<Integer> l2=new HashSet<>(6,0.5f);
        l2.add(23);
        l2.add(234);
        System.out.println(l2);
    }
}
