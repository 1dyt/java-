import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner jw = new Scanner(System.in);
        int a1, a2;
        int b1, b2;
        a1 = 1;
        a2 = 1;
        b1 = 2;
        b2 = 2;
        a1 += b1;//a2=a2+b2
        a2 = a2 + b2;
        System.out.println("a=" + a1);
        System.out.println("a=" + a2);

        a1 -= b1;
        a2 = a2 - b2;
        System.out.println("a=" + a1);
        System.out.println("a=" + a2);


        /*int x,y,z=9;错误的，只赋值了z
        System.out.println(x);*/

        byte num = 126;
        int i = 5;
        num += i;
        System.out.println("num=" + num);

        byte n = 120;
        n = (byte) (n + i);
        System.out.println("n=" + n);

        //&&短路与  &与 |或 ^异或  ！非  ||短路或（除了俩个假的，其他都是真的）
        //& && 同为真才是真，有假就是假
        int n1, n2, c1, c2;
        n1 = 3;
        n2 = 3;
        c1 = c2 = 5;
        System.out.println("***" + (5 < 6 & n2 > n1));
        System.out.println("***" + (4 > ++n1 & c2++ < 6));
        System.out.println("c2=" + c2);
        System.out.println("***" + (5 > ++n1 && c1++ < 6));
        System.out.println("c1=" + c1);

        /*键盘录入一个三位数，将其拆分为个位、十位、百位后、打印在控制台*/
        System.out.println("输入一个三位数");
        Scanner jp = new Scanner(System.in);
        int number = jp.nextInt();
        //number =123;
        if (number >= 1000 | number <= 99) {
            System.out.println("这不是一个三位数，请重新输入");
            number = jp.nextInt();
        }
        if (number >= 100 && number <= 999) {
            int ge = number % 10;
            int shi = number % 100;
            shi /= 10;
            int shi1 = number / 10 % 10;
            int bai = number / 100 % 10;

            System.out.println("number=" + ge + shi + bai + "***" + shi1);
        }
        else{
            System.out.println("这不是一个三位数");
        }
              System.out.println("请输入一个数");
              int num1 =jw.nextInt();
              if(num1%2 ==0) {
                  System.out.println("这是一个偶数");
              }else{
                  System.out.println("这是一个奇数");
            }

             /* while(num2>=0) {
                  System.out.println("请输入一个数");
                  int num2 = jw.nextInt();
                  if (num2 % 2 == 0) {
                      System.out.println("这是一个偶数");
                  } else {
                      System.out.println("这是一个奇数");
                  }
              }*/

        Scanner qq = new Scanner(System.in);
        System.out.println("请输入一个分数");
        int num2 =qq.nextInt();
        if(num2 >= 80){
            System.out.println("优秀");
        }else if(num2>=70){
            System.out.println("中等");
        }else{
            System.out.println("差");
        }

        int x=0;
        int y=1;
        int z=2;
        int max =x>y?x:y;
        System.out.println("max="+max);
        max =max>z?max:z;
        System.out.println("max="+max);

        Scanner ww = new Scanner(System.in);
        System.out.println("输入小明的分数");
        int score=ww.nextInt();
        if(score>=0&&score<=100){
            System.out.println("成绩合法");
            if(score>=95&&score<=100){
                System.out.println("自行车一辆");
            } else if (score>=90&&score<=94) {
                System.out.println("游乐场玩一天");
            } else if (score>=80&&score<=89) {
                System.out.println("变形金刚");
            }else{
                System.out.println("胖揍一顿");
            }
        }
    }
}
