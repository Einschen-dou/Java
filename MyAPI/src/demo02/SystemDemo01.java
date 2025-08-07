package demo02;

public class SystemDemo01 {
    public static void main(String[] args) {
        //终止当前的虚拟机推出程序
//    public static void exit(int status) {
//        System.out.println("退出程序");
//    }
        //方法的形参：
        //状态码：
        //0：正常退出
        //非0：异常退出
        //System.exit(0);
       // System.out.println("看看我执行了吗？");

        //获取当前系统的毫秒值
        //long l = System.currentTimeMillis();
        //System.out.println(l);

        //拷贝数组
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = new int [9];
        //参数1：源数组
        //参数2：源数组的起始索引
        //参数3：目标数组
        //参数4：目标数组的起始索引
        //参数5：拷贝的个数
        System.arraycopy(arr1, 0, arr2, 0, 9);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

    }
}
