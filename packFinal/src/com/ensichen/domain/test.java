package com.ensichen.domain;

import com.ensichen.domain1.Teacher;

public class test {
    public static void main(String[] args) {
        //1.使用同一个包中的类时，不需要导包
        //创建对象
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
        System.out.println(s.getName()+":"+s.getAge());

        //2.使用java.lang包下的类时，不需要导包
        String a = "abc";
        System.out.println(a);
        //我们要找String字符串到底定义在哪个包中，我们可以按住Ctrl键点击String，
        // 或者选中String，然后按Ctrl键+鼠标左键，或者Ctrl+B就可以跳转到String的源码中

        //3.使用不同包中的子类时，需要导包
        Teacher t = new Teacher();

        //4如果使用的是不同包中的类，并且想使用其他包中的子类时，需要导包
        com.ensichen.domain1.Teacher t1 = new com.ensichen.domain1.Teacher();
        com.ensichen.domain2.Teacher t2 = new com.ensichen.domain2.Teacher();
    }
}
