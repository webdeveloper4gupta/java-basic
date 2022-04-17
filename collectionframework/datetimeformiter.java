package collectionframework;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformiter {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

//        date formitter
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println(df);
        String am=dt.format(df);
        System.out.println(am);
    }
}
