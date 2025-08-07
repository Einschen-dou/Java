package sta09;

public class Manager  extends Employee{

    private double bonus;
    public Manager() {

    }
    //带全部参数的构造
    public Manager(String id, String name, double salary,double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //重写父类的方法
    @Override
    public void work() {
        System.out.println("经理在管理其他人");
    }
}
