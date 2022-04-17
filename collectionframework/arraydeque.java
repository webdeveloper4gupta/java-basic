package collectionframework;

import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>l1 =new ArrayDeque<>();//capacity 16
        l1.add(12);//insert at the end
        l1.addFirst(13);
        l1.addLast(29);
        System.out.println(l1.getLast());
        System.out.println(l1.getFirst());
    }
}
