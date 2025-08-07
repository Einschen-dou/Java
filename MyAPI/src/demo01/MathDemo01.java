package demo01;

public class MathDemo01 {
    public static void main(String[] args) {
        //abs 获取参数的绝对值

        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(3.14));
        //bug解释
        //以int型为例，int的取值范围是-2147483648到2147483647
        //如果参数是-2147483648，那么取绝对值后就会超出int的取值范围，所以会返回-2147483648
        //如果参数是-2147483647，那么取绝对值后就会返回2147483647
        //可以索引到源码中的abs方法，发现abs方法的返回值是int类型，所以会返回-2147483648
        System.out.println(Math.abs(-2147483648));

        //ceil 向上取整 数学中的进一法，往数轴中的正方向取整，即大于等于该数的最小整数
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(-3.9));

        //floor 向下取整 数学中的去一法，往数轴中的负方向取整，即小于等于该数的最大整数
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(-3.9));

        //round 四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(-3.6));
        System.out.println(Math.round(-3.5));

        //pow 求幂
        System.out.println(Math.pow(2,3));

        //max 获取最大值
        System.out.println(Math.max(3.4,5.6));

        //random 获取随机数
        System.out.println(Math.random());

    }

}
