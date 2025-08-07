package demo01;

public class MathDemo02 {
    public static void main(String[] args) {
        //要求1：统计一共有多少个水仙花数字
        //水仙花数：100-999之间的数字
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;

            //判断是否为水仙花数
            double sum  =Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
}
