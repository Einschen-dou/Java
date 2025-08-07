package jice;

public class shapi extends Dog{
    @Override
    public void eat() {
        super.eat();// 调用父类的eat方法
        System.out.println("shapi is eating gouliang.");
    }
}
