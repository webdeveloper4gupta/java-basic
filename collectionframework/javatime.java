package collectionframework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class javatime {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalDateTime f=LocalDateTime.now();
        System.out.println(f);

        LocalTime o=LocalTime.now();
        System.out.println(o);
    }
}
