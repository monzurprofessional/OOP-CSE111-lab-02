//TASK 3
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int min = 9999999;
        int max = -9999999;
        System.out.println("enter 10 numbers");
        for (int i = 0; i <=10; i++) {
            int n = sc.nextInt();
            sum+=n;
            if(n>max){
                max=n;
            }
            if (n<min){
                min=n;
            }
        }
        System.out.println("sum:"+sum);
        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("avg:"+ sum/10.0);


    }
}
