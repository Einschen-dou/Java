package jice;

public class chinesedog extends Dog{
    @Override
    public void eat() {
        super.eat();// 调用父类的eat方法
        System.out.println("Chinesedog is eating chinesefood.");
    }
}
