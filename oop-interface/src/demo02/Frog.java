package demo02;

public class Frog extends Animal implements swim{
    public Frog() {

    }
    public Frog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("青蛙会游泳");

    }
}
