package jicehng;

public class test {
    public static void main(String[] args) {
        //创建一个对象
        Student s = new Student();
        s.lunch();
        /*
        吃面条
        咖啡
        吃米饭
        喝水
         */
    }
}
class Person {
    public void eat(){
        System.out.println("吃米饭");
    }
    public void water(){
        System.out.println("喝水");
    }
}
class Student extends Person {
    public void lunch(){
        this.eat();//就近读取子类吃面条
        this.water();//就近读取子类咖啡

        super.eat();//调用父类吃米饭
        super.water();//调用父类喝水
    }
    public void eat(){
        System.out.println("吃面条");
    }
    public void water(){
        System.out.println("咖啡");
    }
}
