package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("----------欢迎来到黑马学生管理系统------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1"->addStudent(list);
                case "2"->deleteStudent(list);
                case "3"->updateStudent(list);
                case "4"->findStudent(list);
                case "5"->{
                    System.out.println("退出");
                    System.exit(0);//停止jvm虚拟机
                }
                default->System.out.println("没有这个选项");
            }
        }
    }
    //添加学生的代码逻辑
    public static void addStudent(ArrayList<Student> list){
        //空参构造
        Student s = new Student();
        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id：");
        String id = sc.next();
        // 问题 1：修正 contains 方法调用，创建 Student 对象传入
        Student tempStudent = new Student();
        tempStudent.setId(id);
        boolean flag = contains(list, tempStudent);
        if (flag) {
            System.out.println("id重复,请重新输入");
            return;
        } else {
            System.out.println("id不重复");
            s.setId(id);
        }

        System.out.println("请输入学生的姓名：");
        // 问题 2：正常使用 sc.next() 获取输入
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的家庭住址：");
        String gender = sc.next();
        s.setAddress(gender);
        //将学生对象添加到集合中
        list.add(s);
        System.out.println("添加学生成功");

    }
    //删除学生的代码逻辑
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的id：");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index>=0){
            list.remove(index);
            System.out.println("删除学生成功");
        }else{
            System.out.println("该信息不存在，请重新输入");
        }
    }
    //修改学生的代码逻辑
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("修改学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的id：");
        String id = sc.next();
        int index = getIndex(list,id);
        if(index>=0){
            Student s = list.get(index);

            System.out.println("请输入学生的姓名：");
            String name = sc.next();
            s.setName(name);

            System.out.println("请输入学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);

            System.out.println("请输入学生的家庭住址：");
            String gender = sc.next();
            s.setAddress(gender);


            System.out.println("修改学生成功");
        }else{
            System.out.println("该信息不存在，请重新输入");
        }
    }
    //查询学生的代码逻辑
    public static void findStudent(ArrayList<Student> list){
        System.out.println("查询学生");
        if (list.size()==0){
            System.out.println("无信息，请先添加信息");
            return;
        }
        //显示表头信息
        System.out.println("学号\t\t姓名\t\t年龄\t\t家庭住址");
        //当代码执行到这里,说明list集合中有数据,可以继续
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t\t"+s.getAddress());

        }
    }
    public static boolean contains(ArrayList<Student> list, Student s){
       // 循环遍历集合,获取每一个学生对象,使用学生对象
       for (int i = 0; i < list.size(); i++) {
            // 拿到学生对象，获取id进行判断
            Student s1 = list.get(i);
            String id1 = s1.getId();
            String id = s.getId();
            if (id.equals(id1)) {
                System.out.println("id重复");
                return true;
            }
       }
       // 当代码执行到这里,说明list集合中没有和s对象相同的id
       return false;
    }

    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            String sid = s.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

