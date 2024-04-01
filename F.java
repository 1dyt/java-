public class F {
    public static void main(String[]args){
        System.out.println(args);
        int num;
        num =printSan(3,4);
        System.out.println("num="+num);
        printSan(3,4);
    }

    public static int printSan(int row,int col){
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        return row*col;//返回值
    }
}
