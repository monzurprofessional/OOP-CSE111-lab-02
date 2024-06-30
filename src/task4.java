//TASK 4
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int min = 999999;
        int max = -999999;
        int count = 0;
        System.out.println("enter 10 nummber:");
        for (int i = 0; i <10; i++) {
            int n = sc.nextInt();
            if(n>0 && n%2!=0){
                sum+=n;
                if(n>max){
                    max=n;
                }
                if(n<min){
                    min=n;
                }
                count++;
            }
        }
        if(count==0){
            System.out.println("No odd positive numbers found");
        }
        else {
            System.out.println("sum:" + sum);
            System.out.println("Minimum:" + min);
            System.out.println("Maximum:" + max);
            System.out.println("Average:" + sum/(double)count);
        }
    }
}
