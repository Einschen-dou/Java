package demo01;

public class MathDemo03 {
    public static void main(String[] args) {
        //要求1：统计一共有多少个水仙花数字
        //水仙花数：100-999之间的数字
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;


            //判断是否为水仙花数
            double sum  =Math.pow(ge,2) + Math.pow(shi,2);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
