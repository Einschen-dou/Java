package demo01;

public class dog extends Animal{
    public dog() {

    }
    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }
    public void dig() {
        System.out.println("狗在刨地");
    }
}
