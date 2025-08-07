package demo04;

public class test {
    public static void main(String[] args) {
        new swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
    }
}
