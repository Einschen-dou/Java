import java.util.Scanner;
public class zhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean isPrime = true;
        int count = 0;
        System.out.print("质数有：");
        for (int x = 2 ;x<=num ;x++){
            isPrime = true;
            if (x == 1) {
                isPrime = true;
            } else {
                for(int i=2; i < x; i++){
                    if(x % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                count++;
                System.out.print( x + " ");
            }
        }
        System.out.println("总共有：" + count + "个质数");
    }
}

