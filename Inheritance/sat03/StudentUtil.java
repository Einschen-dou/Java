package sat03;

import java.util.ArrayList;

public class StudentUtil {
    //私有构造方法，防止外部实例化
    private StudentUtil() {}
    //静态方法
    public static int getMaxScore(ArrayList<Student> list ) {
        //1.定义一个参照物
        int maxAge = list.get(0).getAge();
        //2.遍历集合
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getAge() > maxAge) {
                maxAge = list.get(i).getAge();
            }
        }
        return maxAge;

    }
}
