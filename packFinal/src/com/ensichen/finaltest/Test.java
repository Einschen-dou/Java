package com.ensichen.finaltest;

public class Test {
    public static void main(String[] args) {
        /*
        final 方法：表明该方法是最终方法，不能被重写

       final 类：表明该类是最终类，不能被继承

        final 变量：叫做常量，只能被赋值一次
        */
        final int a = 1;
        int b = 2;
        a=a+b;

    }
}
