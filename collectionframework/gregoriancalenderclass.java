package collectionframework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class gregoriancalenderclass {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//
        GregorianCalendar c=new GregorianCalendar();//website oracle java docs
        System.out.println(c.isLeapYear(2020));
    }
}
