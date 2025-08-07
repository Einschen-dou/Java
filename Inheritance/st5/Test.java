package st5;

public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //创建布偶猫的对象
        Ragdoll rd = new Ragdoll();
        System.out.println("我是布偶猫");
        rd.mice();
        rd.water();
        rd.eat();
        System.out.println("-------------------");

        //创建狸花猫的对象
        Lihua lh = new Lihua();
        System.out.println("我是狸花猫");
        lh.mice();
        lh.water();
        lh.eat();
        System.out.println("-------------------");

        //创建泰迪的对象
        Teddy td = new Teddy();
        System.out.println("我是泰迪");
        td.lookhome();
        td.water();
        td.eat();
        td.Ceng();
        System.out.println("-------------------");

        //创建哈士奇的对象
        Husky hs = new Husky();
        System.out.println("我是哈士奇");
        hs.lookhome();
        hs.water();
        hs.eat();
        hs.breakhome();

    }
}
