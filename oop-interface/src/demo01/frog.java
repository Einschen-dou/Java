package demo01;

public class frog extends Animal{
    public frog() {

    }
    public frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
    public void swimming() {
        System.out.println("青蛙在游泳");
    }
}
