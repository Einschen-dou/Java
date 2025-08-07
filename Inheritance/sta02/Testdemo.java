package sta02;

public class Testdemo {
    public static void main(String[] args) {
        //测试printArray方法
        int[] arr = {1, 2, 3, 4, 5};
        String result = ArrayUtil.printArray(arr);
        System.out.println(result);
        //测试getArray方法
        double[] arr2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double average = ArrayUtil.getArray(arr2);
        System.out.println(average);
    }
}
