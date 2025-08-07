package staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(20);
        s1.setGender("男");
        //公共类，但是s2没有创建对象，所以无法访问teacherName，为null
        //public String teacherName;

        //于是我们想了个方法，用static修饰teacherName，但是这样就变成了静态属性，所有对象共享
        //public  static  String teacherName;
        s1.teacherName = "王老师";

        //还可以用类名.属性名来访问
        //Student.teacherName = "王老师";

        s1.study();
        s1.show();

        //2.创建第二个学生对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(21);
        s2.setGender("女");

        s2.study();
        s2.show();

    }
}
