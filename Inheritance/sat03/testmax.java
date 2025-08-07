package sat03;

import java.util.ArrayList;

public class testmax {
    public static void main(String[] args) {
        //1.创建一个集合来存储
        ArrayList<Student> list = new ArrayList<Student>();
        //2.创建3个学生对象
        Student s1 = new Student("Zhangsan", 20, "男");
        Student s2 = new Student("lisi", 23, "男");
        Student s3 = new Student("wangwu", 25, "女");
        //3.将学生对象添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //4.调用方法
        int max=StudentUtil.getMaxScore(list);
        System.out.println(max);
    }
}
