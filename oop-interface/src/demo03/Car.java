package demo03;

public class Car {
    String name;
    String color;
    int age;
    public void show() {
        System.out.println(this.name);
        Engine engine = new Engine();
        System.out.println(engine.engineType);
    }
    class Engine{
        String engineType;
        int engineYears;

        public void show(){
            System.out.println("发动机型号："+engineType);//可以访问外部类的属性
            System.out.println("车的名称"+name);//可以访问外部类的私有属性,加上private后，内部类也可以访问
        }
    }

}
