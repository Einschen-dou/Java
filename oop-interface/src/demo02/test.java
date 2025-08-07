package demo02;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑", 2);
        System.out.println(dog.getName()+" "+dog.getAge());
        dog.eat();
        dog.swimming();

        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName()+" "+f.getAge());
        f.eat();
        f.swimming();

        Rabbit r = new Rabbit("小紫", 3);
        System.out.println(r.getName()+" "+r.getAge());
        r.eat();

    }
}
