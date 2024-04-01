import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        /*int day =3;//定义一个表示星期几的变量
       switch (day) {
           case 1:
               System.out.println("这是星期一");
               break;
           case 2:
               System.out.println("这是星期二");
               break;
           case 3:
               System.out.println("这是星期三");
               break;
               }*/
        Scanner rj = new Scanner(System.in);
        System.out.println("请输入第一个数");
        double num1 = rj.nextDouble();
        System.out.println("请输入第二个数");
        double num2 = rj.nextDouble();
        System.out.println("请输入第三个数,表示运算符");
        System.out.println("1:表示加法,2:表示减法,3:表示乘法,4:除法");

        int num3 = rj.nextInt();
        double res = 0;
        char ch = '1';
        switch (num3) {
            case 1:
                //System.out.println(num1+"+"+num2+"="+(num1+num2));
                ch = '+';
                res = num1 + num2;
                break;
            case 2:
                //System.out.println(num1+"-"+num2+"="+(num1-num2));
                ch = '-';
                res = num1 - num2;
                break;
            case 3:
                //System.out.println(num1+"*"+num2+"="+(num1*num2));
                ch = '*';
                res = num1 * num2;
                break;
            case 4:
                System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                ch = '/';
                res = num1 / num2;
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        if (ch != 1) {
            System.out.println(num1 + "" + ch + "" + num2 + "=" + res);
        }else if (ch!=1);
    }
}

