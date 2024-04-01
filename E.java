import java.util.Random;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 1000) {
            System.out.println("Hallow Word" + x);
            x++;
        }
        int z = 8844430;
        double c = 0.1;
        int v = 0;
        while (c < z) {
            c *= 2;
            v++;
            System.out.println("第" + v + "对折后的厚度是" + c);
        }
        System.out.println("我们要对折" + v + "次数");

         /*
           有五个洞（0-4），狐狸第一次出现在哪个洞口是随机的，
           我们键盘每次输入一个数，这个数是狐狸在的洞口话，就是抓住了，
           如果不是，狐狸他就跳到下一个洞口，总共是有10次机会，都没抓到游戏结束
         */

        /*int min=10;
        int max=50;
        int count=0;

        Random random =new Random();
        Scanner src =new Scanner(System.in);
        int randomNumber =random.nextInt(5);//0,1,2...7
        System.out.println("狐狸的初始洞口："+randomNumber);
        System.out.println("请输入这次狩猎的洞口");
        int temp =src.nextInt();//我们每次抓的洞口（输入0-4）
        temp %=5;
        System.out.println("这次抓的洞口是："+temp);

        while (temp!=randomNumber){
            System.out.println("这是抓的第"+count+"次");
            if(count>5){
                System.out.println("机会用完了，游戏结束");
                break;
            }
            if(randomNumber==4){
                randomNumber=0;
            }else{
                randomNumber++;
            }
            System.out.println("狐狸在的洞口是："+randomNumber);
            System.out.println("请输入这次狩猎的洞口");
            temp =src.nextInt();//这次抓的洞口（输入0-4）
            temp%=5;
            count++;
            if (count==randomNumber){
                System.out.println("猎人抓到了狐狸，猎人胜利");
            }else {
                System.out.println("这次没有抓到");
            }
        }*/
        /*
        System.out.println("随机数是：" + randomNumber);
        while (count<10) {
            System.out.println("随机数是：" + randomNumber);
            count++;
            randomNumber = random.nextInt(8) ;
        }

        //for(初始化表达式;循环条件;操作表达式）{执行语句}
        int sum=0;
        for (int i=1;i<=100;i+=2){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("sum="+sum);
        int kkk=0;
        for (int i=200,sum1=0;i>=0;i--){
            System.out.println(i);
            sum1+=i;
            kkk+=i;
        }
        System.out.println("kkk="+kkk);*/

        int mm = 0;
        int count = 0;
        for (double s = 0.1; s < 8844430; count++, s *= 2) {
            System.out.println("第" + count + "次对折的厚度是" + s);
            if (s > 8844430) {
                break;
            }
        }
        System.out.println("我们要对折" + count + "次数");

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "");
            }
            System.out.println();
        }
    }
}
