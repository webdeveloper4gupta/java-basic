import java.util.Scanner;
public class twod {
    public static void main(String[] args) {
        int[][] aman=new int[2][3];
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                aman[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.println(aman[i][j]);
            }
        }
    }



}
