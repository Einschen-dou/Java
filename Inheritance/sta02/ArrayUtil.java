package sta02;

public class ArrayUtil {
    //私有构造方法，防止外部实例化
    private ArrayUtil() {}
    public static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append( "[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
    public static double getArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  //累加数组元素
        }
        return sum/arr.length;
    }
}
