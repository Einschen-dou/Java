package demo01;

public class test {
    public static void main(String[] args) {
        dog dog = new dog("小黑", 2);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.eat();
        dog.dig();
        frog f = new frog("小绿", 1);
        System.out.println(f.getName() + "," + f.getAge());
        f.eat();
        f.swimming();
        rabbit r = new rabbit("小红", 3);
        System.out.println(r.getName() + "," + r.getAge());
        r.eat();

    }
}
