package sta09;

public class Test {
    public static void main(String[] args) {
        //创建一个经理对象
        Manager manager = new Manager("001","小明",100000,50000);
        System.out.println(manager.getId()+","+manager.getName()+
                ","+manager.getSalary()+","+manager.getBonus());
        manager.work();
        manager.eat();
        //创建一个厨师对象
        Cook cook = new Cook("002","小红",80000);
        System.out.println(cook.getId()+","+cook.getName()+
                ","+cook.getSalary());
        cook.work();
        cook.eat();

    }
}
