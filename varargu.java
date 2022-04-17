public class varargu {
    static int aman(int ...a){//...a means it is the array
        int i=0;
        for(int arr:a){
            i+=arr;
        }
        return i;
    }

    public static void main(String[] args) {
      int c= aman(1,2,3,4,5);
        System.out.println(c);
    }
}
