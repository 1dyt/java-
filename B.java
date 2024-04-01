//import java.util.Scanner;

public class B {
    public static void main(String[] args){
        //Scanner sc23q=new Scanner(System.in);
        //int x=sc23q.nextInt();
        //System.out.println("x0="+x);
        int x=122;
        {
            int y=244;
            System.out.println("x1="+x);
            System.out.println("y1="+y);
        }
        //y=x;
        System.out.println("x2="+x);
        //System.out.println("y2="+y);
        int a1=3;
        ++a1;//a1=a1+1
        System.out.println("a1="+a1);//4
        int b1=++a1;//++a a++ a=a+1
         System.out.println("a1="+a1);//5
         System.out.println("b1="+b1);//5

        a1++;
        System.out.println("a1="+a1);//6
        int b2=a1++; //b2=a1; a1=a1+1;
        System.out.println("a1="+a1);//7
        System.out.println("b2="+b2);//6

        int a=1,b=1,c=1;
        int c1=c+a+++b;
        System.out.println("c1="+c1); //c1=3;a=a+1=2;c1=c+b+a=3;
        int c2=++a+b+c;
        System.out.println("c2="+c2);//a=a+1=3;c=a+b+c=5;

        int c3 = c2 / c1;
        System.out.println("c3="+c3);//1
        c3=c2%c1;
        System.out.println("c3="+c3);//2

    }
}
