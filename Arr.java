import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        int[]marks=new int[5];
//        i can also intilise array as
//        int []marks;
//        marks=new nextInt();
        /*
        int[]marks={1,2,3}
         */
        System.out.println(marks.length);
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }
}
