package sta02;

public class test {
    public static void main(String[] args) {
        Frog frog = new Frog("小绿", 1);
        System.out.println(frog.getName() + " " + frog.getAge());
        frog.eat();
        frog.drink();

        Dog dog = new Dog("小蓝", 2);
        System.out.println(dog.getName() + " " + dog.getAge());
        dog.eat();
        dog.drink();

        Sheep sheep = new Sheep("小红", 3);
        System.out.println(sheep.getName() + " " + sheep.getAge());
        sheep.eat();
        sheep.drink();

    }
}
