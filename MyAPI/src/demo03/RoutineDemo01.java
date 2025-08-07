package demo03;

import java.io.IOException;

public class RoutineDemo01 {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime对象
        Runtime runtime = Runtime.getRuntime();

        //2.exit停止虚拟机
        //runtime.exit(0);
        //System.out.println("看看我执行了吗？");

        //3.获取虚拟机的最大内存
        long maxMemory = runtime.maxMemory();
        System.out.println("虚拟机的最大内存"+maxMemory);

        //4.获得CPU的核数
        int availableProcessors = runtime.availableProcessors();
        System.out.println("CPU的核数"+availableProcessors);

        //5.获得JVM的总内存
        long totalMemory = runtime.totalMemory();
        System.out.println("JVM的总内存"+totalMemory/1024/1024+"M");

        //6.获得JVM的空闲内存
        long freeMemory = runtime.freeMemory();
        System.out.println("JVM的空闲内存"+freeMemory/1024/1024+"M");

        //7.运行cmd命令
        Runtime.getRuntime().exec("notepad.exe");


    }
}
