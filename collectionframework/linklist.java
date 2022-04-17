package collectionframework;

import java.util.LinkedList;

public class linklist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();//we cannot give initial capacity
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(22);
        l2.add(23);
//        add method
        l1.add(2);
//        System.out.println(l1.get(0));
        l1.addAll(l2);
        l1.addLast(56);
        l1.addFirst(45);
        for(int i =0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
