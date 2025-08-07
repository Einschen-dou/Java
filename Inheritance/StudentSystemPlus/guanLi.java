package StudentSystemPlus;

import StudentSystem.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class guanLi {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        System.out.println("欢迎来到学生管理系统");
        System.out.println("选择操作 1.注册 2.登录 3.忘记密码");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case  "1" ->register(list);
            case  "2" ->login(list);
            case  "3" ->forgetPassword(list);
            default ->System.out.println("没有这个选项");
        }
    }
    public static void register(ArrayList<Student> list) {

    }
    public static void login(ArrayList<Student> list) {

    }
    public static void forgetPassword(ArrayList<Student> list) {

    }
}
