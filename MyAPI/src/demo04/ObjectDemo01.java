package demo04;

public class ObjectDemo01 {
    public static void main(String[] args) {
        // 1.toString()方法
        Object obj = new Object();
        String str = obj.toString();
        // 打印对象的字符串表示形式
        System.out.println(str);//java.lang.Object@10f87f48

        //细节;
        //1.默认返回：全类名+@+内存地址值(十六进制)



    }
}
